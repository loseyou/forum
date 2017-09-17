package com.lose.forum.dao;

import com.lose.forum.model.User;

/**
 *
 * @author lose
 * @since 2017-09-16
 */
public interface UserDao {

	void add(User user);

	User findUser(User user);

	User deleteUser(User user);

}