package com.lose.forum.service;

import com.lose.forum.model.User;
import java.util.List;


/**
 *
 * @author lose
 * @since 2017-09-17
 */
public interface UserService{
	
	Integer addUser(User user);
	
	Integer deleteUser(User user);
	
	Integer updateUser(User user);
	
	User selectUserById(User user);
	
	List<User> selectUserList();
	
}
