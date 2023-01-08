package com.example.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.dto.MenuTestDto;
import com.example.backend.service.MenuTestServiceImpl;

@RestController
@RequestMapping("/menu")
public class MenuTestApiController {
	
	@Autowired
	private MenuTestServiceImpl menuService;
	
	// 메뉴 리스트 조회
	@GetMapping("/menulist")
	public List<MenuTestDto> getMenuList(){
		return menuService.getMenuList();
	}
	
	// 하위 메뉴 조회
	@GetMapping("/menulist/{menuId}")
	public List<MenuTestDto> getSubMenuList(@PathVariable(required=true) String menuId){
		return menuService.getSubMenuList(menuId);
	}
	
	// 최대 depth 조회
	@GetMapping("/menulist/maxDepth")
	public int getMaxDepth() {
		return menuService.getMaxDepth();
	}
}
