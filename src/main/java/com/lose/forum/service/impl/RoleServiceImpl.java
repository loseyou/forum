package com.lose.forum.service.impl;

import com.lose.forum.service.RoleService;
import org.springframework.stereotype.Service;
import com.lose.forum.dao.RoleDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.lose.forum.model.Role;


/**
 *
 * @author lose
 * @since 2017-09-17
 */
@Service
public class RoleServiceImpl implements RoleService {
	
	private static final Logger logger = LoggerFactory.getLogger(RoleServiceImpl.class);
	
	@Autowired
	private RoleDao roleDao;
	
	public Integer addRole(Role role){
		return roleDao.addRole(role);
	}
	
	public Integer deleteRole(Role role){
		return roleDao.deleteRole(role);
	}
	
	public Integer updateRole(Role role){
		return roleDao.updateRole(role);
	}
	
	public Role selectRoleById(Role role){
		return roleDao.selectRoleById(role);
	}
	
	public List<Role> selectRoleList(){
		return roleDao.selectRoleList();
	}
	
}
