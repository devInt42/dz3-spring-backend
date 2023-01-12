package com.example.backend.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.backend.dto.MenuTestDto;

@Mapper
public interface MenuTestMapper {
	List<MenuTestDto> getMenuList();
	List<MenuTestDto> getSubMenuList(String menuId);
	Integer getParentDepth(String menuParent);
	void insertMenu(Map<String, String> map);
}
