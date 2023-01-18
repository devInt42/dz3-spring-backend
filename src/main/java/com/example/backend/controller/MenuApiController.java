package com.example.backend.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.dto.MenuDto;
import com.example.backend.service.MenuServiceImpl;

@RestController
@RequestMapping("/menu")
public class MenuApiController {
	
	@Autowired
	private MenuServiceImpl menuService;
	
	// 메뉴 리스트 조회
	@GetMapping("/menulist")
	public List<MenuDto> getMenuList(){
		return menuService.getMenuList();
	}
	
	// 하위 메뉴 조회
	@GetMapping("/menulist/{menuSequence}")
	public List<MenuDto> getSubMenuList(@PathVariable(required=true) int menuSequence){
		return menuService.getSubMenuList(menuSequence);

	}
	
	// 상위메뉴 depth 조회
	@GetMapping("/menulist/getdepth/{menuParent}")
	public Integer getParentDepth(@PathVariable(required=true) int menuParent) {
		return menuService.getParentDepth(menuParent);
	}
	
	// 메뉴 저장
	@PostMapping
	public void insertMenu(@RequestBody(required=true) Map<String, String> map) {
		System.out.println(map);
		menuService.insertMenu(map);
	}
}
