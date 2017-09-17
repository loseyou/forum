package com.lose.forum.controller;

import com.lose.forum.service.MenuService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.lose.forum.model.Menu;
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
@RequestMapping("/menu")
public class MenuController {

	private static final Logger logger = LoggerFactory.getLogger(MenuController.class);
	
	@Autowired
	private MenuService menuService;
	
	@PostMapping
	public @ResponseBody Integer addMenu(Menu menu){
		return menuService.addMenu(menu);
	}
	
	@DeleteMapping
	public @ResponseBody Menu deleteMenu(Menu menu) {
		menuService.deleteMenu(menu);
		return menu;
	}
	
	@PutMapping
	public @ResponseBody Menu updateMenu(Menu menu){
		menuService.updateMenu(menu);
		return menu;
	}
	
	@GetMapping
	public @ResponseBody Menu selectMenuById(Menu menu){
		return menuService.selectMenuById(menu);
	}
	
	
	@GetMapping("/menus")
	public @ResponseBody List<Menu> selectMenuList(){
		return menuService.selectMenuList();
	}

}
