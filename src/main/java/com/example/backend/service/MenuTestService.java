package com.example.backend.service;

import java.util.List;
import java.util.Map;

import com.example.backend.dto.MenuTestDto;

public interface MenuTestService {
	// 메뉴 리스트 조회
	List<MenuTestDto> getMenuList();
	
	// 하위 메뉴 조회
	List<MenuTestDto> getSubMenuList(String menuId);
	
	// 상위메뉴 depth 조회
	Integer getParentDepth(String menuParent);
	
	void insertMenu(Map <String, String> map);

}
