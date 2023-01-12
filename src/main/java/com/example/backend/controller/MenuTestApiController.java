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
		System.out.println(menuService.getSubMenuList(menuId));
		if(menuService.getSubMenuList(menuId).isEmpty()) {
			return menuService.getSubMenuList("none");
		}else {return menuService.getSubMenuList(menuId);}
		
	}
	
	// 상위메뉴 depth 조회
	@GetMapping("/menulist/getdepth/{menuParent}")
	public Integer getParentDepth(@PathVariable(required=true) String menuParent) {
		return menuService.getParentDepth(menuParent);
	}
	
	// 메뉴 저장
	@PostMapping
	public void insertMenu(@RequestBody(required=true) Map<String, String> map) {
		System.out.println(map);
		menuService.insertMenu(map);
	}
}
