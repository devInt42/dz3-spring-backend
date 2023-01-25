package com.example.backend.service;

import java.util.List;
import java.util.Map;

import com.example.backend.dto.MenuDto;

public interface MenuService {
	
	// 깊이별 메뉴리스트 조회
	List<MenuDto> getChildMenuListByDepth(MenuDto dto);
	
	// 깊이별 메뉴리스트 카운트
	int getCountMenuListByDepth(MenuDto dto);
	
	// 메뉴 리스트 조회
	List<MenuDto> getMenuList();
	
	// 하위 메뉴 조회
	List<MenuDto> getSubMenuList(int menuSequence);
	
	// 상위메뉴 depth 조회
	Integer getParentDepth(int menuParent);
	
	// 메뉴 삽입
	void insertMenu(Map <String, String> map);
	
	// 메뉴 삭제
	void deleteMenu(int menuSeq);
	
	// 메뉴 수정
	void updateMenu(Map<String, String> map);
	
	// 삽입 전 중복조회(메뉴코드)
	List<MenuDto> checkCode(String menuCode);
	
	// 삽입 전 중복조회(메뉴이름)
	List<MenuDto> checkName(String menuName);
}
