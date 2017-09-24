package com.lose.forum.aop;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.lose.forum.annotation.ParamValid;

@Aspect
@Component
public class ParamValidAop {

	private static final Logger logger = LoggerFactory.getLogger(ParamValidAop.class);
	
	private static final Validator validator; 
	
	static {  
        ValidatorFactory vf = Validation.buildDefaultValidatorFactory();  
        validator = vf.getValidator();  
    }  
	
	@Around("@annotation(com.lose.forum.annotation.MethodValid)")
	public Object paramValid(ProceedingJoinPoint proceedJoinPoint) throws Throwable {
		Object[] args = proceedJoinPoint.getArgs();
		
		MethodSignature signature = (MethodSignature) proceedJoinPoint.getSignature();  
        Method method = signature.getMethod(); 
        logger.info("method "+method.getName());
        Annotation[][] annos = method.getParameterAnnotations();
        logger.info("annos "+annos.length);
        for(int i=0;i<annos.length;i++) {
        		Annotation[] ans=annos[i];
        		logger.info("ans "+ans.length);
        		for(int j=0;j<ans.length;j++) {
        			logger.info("annotationType "+ans[j].annotationType());
        			if(ans[j].annotationType()==ParamValid.class) {
        				logger.info("annation "+args[i]);
        				Set<ConstraintViolation<Object>> set = validator.validate(args[i]);  
        		        if (set != null && !set.isEmpty()) {
        		        		logger.info("参数校验失败");
        		        }else {
        		        		return proceedJoinPoint.proceed();
        		        }
        			}
        		}
        }
       
        return null;  
	}
	
	 public static List<String> violation(Object object) {  
	        List<String> msgs = new ArrayList<String>();  
	        Set<ConstraintViolation<Object>> set = validator.validate(object);  
	        if (set != null && !set.isEmpty()) {  
	            for (ConstraintViolation<Object> cvo : set) {  
	                msgs.add(cvo.getMessage());  
	            }  
	        }  
	        return msgs;  
	    }  
	
}
