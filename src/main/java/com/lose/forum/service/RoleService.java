package com.lose.forum.service;

import com.lose.forum.model.Role;
import java.util.List;


/**
 *
 * @author lose
 * @since 2017-09-17
 */
public interface RoleService{
	
	Integer addRole(Role role);
	
	Integer deleteRole(Role role);
	
	Integer updateRole(Role role);
	
	Role selectRoleById(Role role);
	
	List<Role> selectRoleList();
	
}
