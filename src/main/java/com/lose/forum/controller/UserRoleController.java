package com.lose.forum.controller;

import com.lose.forum.service.UserRoleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.lose.forum.model.UserRole;
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
@RequestMapping("/userRole")
public class UserRoleController {

	private static final Logger logger = LoggerFactory.getLogger(UserRoleController.class);
	
	@Autowired
	private UserRoleService userRoleService;
	
	@PostMapping
	public @ResponseBody Integer addUserRole(UserRole userRole){
		return userRoleService.addUserRole(userRole);
	}
	
	@DeleteMapping
	public @ResponseBody UserRole deleteUserRole(UserRole userRole) {
		userRoleService.deleteUserRole(userRole);
		return userRole;
	}
	
	@PutMapping
	public @ResponseBody UserRole updateUserRole(UserRole userRole){
		userRoleService.updateUserRole(userRole);
		return userRole;
	}
	
	@GetMapping
	public @ResponseBody UserRole selectUserRoleById(UserRole userRole){
		return userRoleService.selectUserRoleById(userRole);
	}
	
	
	@GetMapping("/userRoles")
	public @ResponseBody List<UserRole> selectUserRoleList(){
		return userRoleService.selectUserRoleList();
	}

}
