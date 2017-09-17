package com.lose.forum.service;

import com.lose.forum.model.RoleMenu;
import java.util.List;


/**
 *
 * @author lose
 * @since 2017-09-17
 */
public interface RoleMenuService{
	
	Integer addRoleMenu(RoleMenu roleMenu);
	
	Integer deleteRoleMenu(RoleMenu roleMenu);
	
	Integer updateRoleMenu(RoleMenu roleMenu);
	
	RoleMenu selectRoleMenuById(RoleMenu roleMenu);
	
	List<RoleMenu> selectRoleMenuList();
	
}
