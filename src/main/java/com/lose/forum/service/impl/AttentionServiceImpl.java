package com.lose.forum.service.impl;

import com.lose.forum.service.AttentionService;
import org.springframework.stereotype.Service;
import com.lose.forum.dao.AttentionDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.lose.forum.model.Attention;


/**
 *
 * @author lose
 * @since 2017-09-17
 */
@Service
public class AttentionServiceImpl implements AttentionService {
	
	private static final Logger logger = LoggerFactory.getLogger(AttentionServiceImpl.class);
	
	@Autowired
	private AttentionDao attentionDao;
	
	public Integer addAttention(Attention attention){
		return attentionDao.addAttention(attention);
	}
	
	public Integer deleteAttention(Attention attention){
		return attentionDao.deleteAttention(attention);
	}
	
	public Integer updateAttention(Attention attention){
		return attentionDao.updateAttention(attention);
	}
	
	public Attention selectAttentionById(Attention attention){
		return attentionDao.selectAttentionById(attention);
	}
	
	public List<Attention> selectAttentionList(){
		return attentionDao.selectAttentionList();
	}
	
}
