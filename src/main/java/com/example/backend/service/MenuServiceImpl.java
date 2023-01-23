package com.example.backend.service;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.backend.dto.MenuDto;
import com.example.backend.mapper.MenuMapper;

@Component
public class MenuServiceImpl implements MenuService {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	// 깊이별 메뉴리스트 조회
	@Override
	public List<MenuDto> getChildMenuListByDepth(MenuDto dto) {
		return sqlSession.getMapper(MenuMapper.class).getChildListByDepth(dto);
	}

	// 깊이별 메뉴리스트 카운트
	@Override
	public int getCountMenuListByDepth(MenuDto dto) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(MenuMapper.class).getCountListByDepth(dto);
	}
	
	// 메뉴 리스트 조회
	@Override
	public List<MenuDto> getMenuList() {
		return sqlSession.getMapper(MenuMapper.class).getMenuList();
	}

	// 하위 메뉴 조회
	@Override
	public List<MenuDto> getSubMenuList(int menuSequence) {
		return sqlSession.getMapper(MenuMapper.class).getSubMenuList(menuSequence);
	}

	// 상위메뉴 depth 조회
	@Override
	public Integer getParentDepth(String menuParent) {
		return sqlSession.getMapper(MenuMapper.class).getParentDepth(menuParent);
	}

	@Override
	public void insertMenu(Map<String, String> map) {
		sqlSession.getMapper(MenuMapper.class).insertMenu(map);
	}





}
