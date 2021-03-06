package com.lose.forum.service;

import com.lose.forum.model.UserRole;
import java.util.List;


/**
 *
 * @author lose
 * @since 2017-09-17
 */
public interface UserRoleService{
	
	Integer addUserRole(UserRole userRole);
	
	Integer deleteUserRole(UserRole userRole);
	
	Integer updateUserRole(UserRole userRole);
	
	UserRole selectUserRoleById(UserRole userRole);
	
	List<UserRole> selectUserRoleList();
	
}
