package com.lose.forum.service.impl;

import com.lose.forum.dao.UserDao;
import com.lose.forum.model.User;
import com.lose.forum.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author lose
 * @since 2017-09-16
 */
@Service
public class UserServiceImpl implements UserService {

	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserDao userDao;
	
	public void addUser(User user) {
		userDao.add(user);
	}

	public User findUser(User user) {
		return userDao.findUser(user);
	}

	public User deleteUser(User user) {
		userDao.deleteUser(user);
		return userDao.findUser(user);
	}
	
}
