package com.lose.forum.service.impl;

import com.lose.forum.service.MenuService;
import org.springframework.stereotype.Service;
import com.lose.forum.dao.MenuDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.lose.forum.model.Menu;


/**
 *
 * @author lose
 * @since 2017-09-17
 */
@Service
public class MenuServiceImpl implements MenuService {
	
	private static final Logger logger = LoggerFactory.getLogger(MenuServiceImpl.class);
	
	@Autowired
	private MenuDao menuDao;
	
	public Integer addMenu(Menu menu){
		return menuDao.addMenu(menu);
	}
	
	public Integer deleteMenu(Menu menu){
		return menuDao.deleteMenu(menu);
	}
	
	public Integer updateMenu(Menu menu){
		return menuDao.updateMenu(menu);
	}
	
	public Menu selectMenuById(Menu menu){
		return menuDao.selectMenuById(menu);
	}
	
	public List<Menu> selectMenuList(){
		return menuDao.selectMenuList();
	}
	
}
