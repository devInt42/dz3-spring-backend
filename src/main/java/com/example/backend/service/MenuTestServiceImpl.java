package com.example.backend.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.backend.dto.MenuTestDto;
import com.example.backend.mapper.MenuTestMapper;

@Component
public class MenuTestServiceImpl implements MenuTestService {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	// 메뉴 리스트 조회
	@Override
	public List<MenuTestDto> getMenuList() {
		return sqlSession.getMapper(MenuTestMapper.class).getMenuList();
	}

	// 하위 메뉴 조회
	@Override
	public List<MenuTestDto> getSubMenuList(String menuId) {
		return sqlSession.getMapper(MenuTestMapper.class).getSubMenuList(menuId);
	}

}
