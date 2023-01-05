package com.example.backend.service;

import java.util.List;
import java.util.Map;

import com.example.backend.dto.MenuDto;

public interface MenuService {
	MenuDto getMenuBySeq(int menuSeq);
	List<MenuDto> getMenuList(MenuDto dto);
	void removeMenu(int menuSeq);
	void setMenu(Map<String, String> map);
	void addMenu(Map<String, String> map);
}
