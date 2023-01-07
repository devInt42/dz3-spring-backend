package com.example.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.dto.MenuTestDto;
import com.example.backend.service.MenuTestServiceImpl;

@RestController
@RequestMapping("/menu")
public class MenuTestApiController {
	
	@Autowired
	private MenuTestServiceImpl menuService;
	
	@GetMapping("/menulist")
	public List<MenuTestDto> getMenuList(){
		return menuService.getMenuList();
	}
}
