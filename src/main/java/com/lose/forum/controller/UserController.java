package com.lose.forum.controller;

import java.util.List;

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

import com.lose.forum.annotation.MethodValid;
import com.lose.forum.annotation.ParamValid;
import com.lose.forum.model.User;
import com.lose.forum.service.UserService;

/**
 *
 * @author lose
 * @since 2017-09-17
 */
@RestController
@RequestMapping("/user")
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;

	@MethodValid
	@PostMapping
	public @ResponseBody Integer addUser(@ParamValid User user){
		return userService.addUser(user);
	}
	
	@DeleteMapping
	public @ResponseBody User deleteUser(User user) {
		userService.deleteUser(user);
		return user;
	}
	
	@PutMapping
	public @ResponseBody User updateUser(User user){
		userService.updateUser(user);
		return user;
	}
	
	@GetMapping
	public @ResponseBody User selectUserById(User user){
		return userService.selectUserById(user);
	}
	
	
	@GetMapping("/users")
	public @ResponseBody List<User> selectUserList(){
		return userService.selectUserList();
	}

}
