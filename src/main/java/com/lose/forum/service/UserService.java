package com.lose.forum.service;

import com.lose.forum.model.User;

/**
 *
 * @author lose
 * @since 2017-09-16
 */
public interface UserService{

	void addUser(User user);

	User findUser(User user);

	User deleteUser(User user);
	
}
