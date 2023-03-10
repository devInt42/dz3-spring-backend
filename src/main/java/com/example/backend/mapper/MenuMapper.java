package com.example.backend.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.backend.dto.MenuDto;

@Mapper
public interface MenuMapper {
	List<MenuDto> getChildListByDepth(MenuDto dto);

	List<MenuDto> getSelectMenu(int menuSequence);

	int getCountListByDepth(MenuDto dto);

	List<MenuDto> getMenuList();

	List<MenuDto> getSubMenuList(int menuSequence);

	Integer getParentDepth(int menuParent);

	void insertMenu(Map<String, String> map);

	void deleteMenu(int menuSeq);

	void updateMenu(Map<String, String> map);

	List<MenuDto> checkCode(String menuCode);

	List<MenuDto> checkName(String menuName);

	List<MenuDto> getAllList();

	String getURL(int menuSeq);

	Integer countMenu(int menuSeq);

	List<MenuDto> getTree(int menuParent);

}
