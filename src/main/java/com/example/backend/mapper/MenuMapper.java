package com.example.backend.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.backend.dto.MenuDto;

@Mapper
public interface MenuMapper {
	List<MenuDto> getMenuList();
	List<MenuDto> getSubMenuList(int menuSequence);
	Integer getParentDepth(int menuParent);
	void insertMenu(Map<String, String> map);
}
