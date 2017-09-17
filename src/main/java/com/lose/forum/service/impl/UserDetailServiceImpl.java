package com.lose.forum.service.impl;

import com.lose.forum.service.UserDetailService;
import org.springframework.stereotype.Service;
import com.lose.forum.dao.UserDetailDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.lose.forum.model.UserDetail;


/**
 *
 * @author lose
 * @since 2017-09-17
 */
@Service
public class UserDetailServiceImpl implements UserDetailService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserDetailServiceImpl.class);
	
	@Autowired
	private UserDetailDao userDetailDao;
	
	public Integer addUserDetail(UserDetail userDetail){
		return userDetailDao.addUserDetail(userDetail);
	}
	
	public Integer deleteUserDetail(UserDetail userDetail){
		return userDetailDao.deleteUserDetail(userDetail);
	}
	
	public Integer updateUserDetail(UserDetail userDetail){
		return userDetailDao.updateUserDetail(userDetail);
	}
	
	public UserDetail selectUserDetailById(UserDetail userDetail){
		return userDetailDao.selectUserDetailById(userDetail);
	}
	
	public List<UserDetail> selectUserDetailList(){
		return userDetailDao.selectUserDetailList();
	}
	
}
