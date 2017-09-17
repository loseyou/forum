package com.lose.forum.service.impl;

import com.lose.forum.service.UserRoleService;
import org.springframework.stereotype.Service;
import com.lose.forum.dao.UserRoleDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.lose.forum.model.UserRole;


/**
 *
 * @author lose
 * @since 2017-09-17
 */
@Service
public class UserRoleServiceImpl implements UserRoleService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserRoleServiceImpl.class);
	
	@Autowired
	private UserRoleDao userRoleDao;
	
	public Integer addUserRole(UserRole userRole){
		return userRoleDao.addUserRole(userRole);
	}
	
	public Integer deleteUserRole(UserRole userRole){
		return userRoleDao.deleteUserRole(userRole);
	}
	
	public Integer updateUserRole(UserRole userRole){
		return userRoleDao.updateUserRole(userRole);
	}
	
	public UserRole selectUserRoleById(UserRole userRole){
		return userRoleDao.selectUserRoleById(userRole);
	}
	
	public List<UserRole> selectUserRoleList(){
		return userRoleDao.selectUserRoleList();
	}
	
}
