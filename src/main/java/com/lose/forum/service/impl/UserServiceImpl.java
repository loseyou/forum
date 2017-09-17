package com.lose.forum.service.impl;

import com.lose.forum.service.UserService;
import org.springframework.stereotype.Service;
import com.lose.forum.dao.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.lose.forum.model.User;


/**
 *
 * @author lose
 * @since 2017-09-17
 */
@Service
public class UserServiceImpl implements UserService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserDao userDao;
	
	public Integer addUser(User user){
		return userDao.addUser(user);
	}
	
	public Integer deleteUser(User user){
		return userDao.deleteUser(user);
	}
	
	public Integer updateUser(User user){
		return userDao.updateUser(user);
	}
	
	public User selectUserById(User user){
		return userDao.selectUserById(user);
	}
	
	public List<User> selectUserList(){
		return userDao.selectUserList();
	}
	
}
