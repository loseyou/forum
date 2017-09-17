package com.lose.forum.service.impl;

import com.lose.forum.service.RoleMenuService;
import org.springframework.stereotype.Service;
import com.lose.forum.dao.RoleMenuDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.lose.forum.model.RoleMenu;


/**
 *
 * @author lose
 * @since 2017-09-17
 */
@Service
public class RoleMenuServiceImpl implements RoleMenuService {
	
	private static final Logger logger = LoggerFactory.getLogger(RoleMenuServiceImpl.class);
	
	@Autowired
	private RoleMenuDao roleMenuDao;
	
	public Integer addRoleMenu(RoleMenu roleMenu){
		return roleMenuDao.addRoleMenu(roleMenu);
	}
	
	public Integer deleteRoleMenu(RoleMenu roleMenu){
		return roleMenuDao.deleteRoleMenu(roleMenu);
	}
	
	public Integer updateRoleMenu(RoleMenu roleMenu){
		return roleMenuDao.updateRoleMenu(roleMenu);
	}
	
	public RoleMenu selectRoleMenuById(RoleMenu roleMenu){
		return roleMenuDao.selectRoleMenuById(roleMenu);
	}
	
	public List<RoleMenu> selectRoleMenuList(){
		return roleMenuDao.selectRoleMenuList();
	}
	
}
