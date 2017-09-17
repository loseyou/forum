package com.lose.forum.controller;

import com.lose.forum.service.RoleMenuService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.lose.forum.model.RoleMenu;
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
@RequestMapping("/roleMenu")
public class RoleMenuController {

	private static final Logger logger = LoggerFactory.getLogger(RoleMenuController.class);
	
	@Autowired
	private RoleMenuService roleMenuService;
	
	@PostMapping
	public @ResponseBody Integer addRoleMenu(RoleMenu roleMenu){
		return roleMenuService.addRoleMenu(roleMenu);
	}
	
	@DeleteMapping
	public @ResponseBody RoleMenu deleteRoleMenu(RoleMenu roleMenu) {
		roleMenuService.deleteRoleMenu(roleMenu);
		return roleMenu;
	}
	
	@PutMapping
	public @ResponseBody RoleMenu updateRoleMenu(RoleMenu roleMenu){
		roleMenuService.updateRoleMenu(roleMenu);
		return roleMenu;
	}
	
	@GetMapping
	public @ResponseBody RoleMenu selectRoleMenuById(RoleMenu roleMenu){
		return roleMenuService.selectRoleMenuById(roleMenu);
	}
	
	
	@GetMapping("/roleMenus")
	public @ResponseBody List<RoleMenu> selectRoleMenuList(){
		return roleMenuService.selectRoleMenuList();
	}

}
