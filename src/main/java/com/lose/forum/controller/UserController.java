package com.lose.forum.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lose.forum.model.User;
import com.lose.forum.service.UserService;

/**
 *
 * @author lose
 * @since 2017-09-16
 */
@RestController
@RequestMapping("/user")
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@PostMapping
	public @ResponseBody User register(User user) {
		logger.info("user "+user);
		userService.addUser(user);
		return user;
	}
	
	@GetMapping
	public @ResponseBody User get(User user) {
		logger.info("user "+user);
		User getUser=userService.findUser(user);
		logger.info("getUser "+getUser);
		return getUser;
	}
	
	@DeleteMapping
	public @ResponseBody User delete(User user) {
		logger.info("user "+user);
		User deleteUser=userService.deleteUser(user);
		logger.info("deleteUser "+deleteUser);
		return user;
	}
	
	@PutMapping
	public @ResponseBody User put(User user) {
		return user;
	}
}
