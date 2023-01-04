package com.example.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.dto.MenuDto;
import com.example.backend.service.MenuServiceImpl;

@RestController
@RequestMapping("/menu")
public class MenuApiController {
	
	@Autowired
	private MenuServiceImpl menuService;
	
	@GetMapping("/menulist")
	public List<MenuDto> getMenuList(){
		return menuService.getMenuList();
	}
}
