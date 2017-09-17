package com.lose.forum.controller;

import com.lose.forum.service.UserDetailService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.lose.forum.model.UserDetail;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lose
 * @since 2017-09-17
 */
@RestController
@RequestMapping("/userDetail")
public class UserDetailController {

	private static final Logger logger = LoggerFactory.getLogger(UserDetailController.class);
	
	@Autowired
	private UserDetailService userDetailService;
	
	@PostMapping
	public @ResponseBody Integer addUserDetail(UserDetail userDetail){
		return userDetailService.addUserDetail(userDetail);
	}
	
	@DeleteMapping
	public @ResponseBody UserDetail deleteUserDetail(UserDetail userDetail) {
		userDetailService.deleteUserDetail(userDetail);
		return userDetail;
	}
	
	@PutMapping
	public @ResponseBody UserDetail updateUserDetail(UserDetail userDetail){
		userDetailService.updateUserDetail(userDetail);
		return userDetail;
	}
	
	@GetMapping
	public @ResponseBody UserDetail selectUserDetailById(UserDetail userDetail){
		return userDetailService.selectUserDetailById(userDetail);
	}
	
	
	@GetMapping("/userDetails")
	public @ResponseBody List<UserDetail> selectUserDetailList(){
		return userDetailService.selectUserDetailList();
	}

}
