package com.lose.forum.service;

import com.lose.forum.model.Menu;
import java.util.List;


/**
 *
 * @author lose
 * @since 2017-09-17
 */
public interface MenuService{
	
	Integer addMenu(Menu menu);
	
	Integer deleteMenu(Menu menu);
	
	Integer updateMenu(Menu menu);
	
	Menu selectMenuById(Menu menu);
	
	List<Menu> selectMenuList();
	
}
