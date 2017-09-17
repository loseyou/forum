package com.lose.forum.controller;

import com.lose.forum.service.RoleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.lose.forum.model.Role;
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
@RequestMapping("/role")
public class RoleController {

	private static final Logger logger = LoggerFactory.getLogger(RoleController.class);
	
	@Autowired
	private RoleService roleService;
	
	@PostMapping
	public @ResponseBody Integer addRole(Role role){
		return roleService.addRole(role);
	}
	
	@DeleteMapping
	public @ResponseBody Role deleteRole(Role role) {
		roleService.deleteRole(role);
		return role;
	}
	
	@PutMapping
	public @ResponseBody Role updateRole(Role role){
		roleService.updateRole(role);
		return role;
	}
	
	@GetMapping
	public @ResponseBody Role selectRoleById(Role role){
		return roleService.selectRoleById(role);
	}
	
	
	@GetMapping("/roles")
	public @ResponseBody List<Role> selectRoleList(){
		return roleService.selectRoleList();
	}

}
