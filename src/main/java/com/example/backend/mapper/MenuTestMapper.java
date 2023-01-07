package com.example.backend.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.backend.dto.MenuTestDto;

@Mapper
public interface MenuTestMapper {
	List<MenuTestDto> getMenuList();
	List<MenuTestDto> getSubMenuList(String menuId);
}
