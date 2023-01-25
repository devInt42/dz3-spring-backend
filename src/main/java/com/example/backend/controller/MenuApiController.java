package com.example.backend.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
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
	
	// 메뉴 삭제
	@DeleteMapping("/menulist/delete/{menuSeq}")
	public void deleteMenu(@PathVariable(required=true) int menuSeq) {
		System.out.println("삭제 왔다"+menuSeq);
		menuService.deleteMenu(menuSeq);
	}
	
	// 메뉴 수정
	@PatchMapping("/menulist/update/{menuSeq}")
	public void updateMenu(@PathVariable(required=true) String menuSeq, @RequestBody(required=true) Map<String, String> map) {
		System.out.println(map);
		map.put("menuSeq", menuSeq);
		System.out.println(map);
		menuService.updateMenu(map);
	}
	
	// 삽입 전 중복조회(메뉴코드)
	@GetMapping("/menulist/checkcode/{menuCode}")
	public List<MenuDto> checkCode(@PathVariable(required=true) String menuCode){
		System.out.println("중복 코드 잏ㅆ" + menuService.checkCode(menuCode));
		return menuService.checkCode(menuCode);
	}
	
	// 삽입 전 중복조회(메뉴이름)
	@GetMapping("/menulist/checkname/{menuName}")
	public List<MenuDto> checkName(@PathVariable(required=true) String menuName){
		System.out.println("중복 d=이름 있음" + menuService.checkName(menuName));
		return menuService.checkName(menuName);
	}
	
}
