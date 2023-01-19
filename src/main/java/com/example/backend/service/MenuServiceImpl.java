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
	public Integer getParentDepth(int menuParent) {
		return sqlSession.getMapper(MenuMapper.class).getParentDepth(menuParent);
	}

	// 메뉴 저장
	@Override
	public void insertMenu(Map<String, String> map) {
		sqlSession.getMapper(MenuMapper.class).insertMenu(map);
	}

	// 메뉴 삭제
	@Override
	public void deleteMenu(int menuSeq) {
		sqlSession.getMapper(MenuMapper.class).deleteMenu(menuSeq);
	}

	// 메뉴 수정
	@Override
	public void updateMenu(Map<String, String> map) {
		sqlSession.getMapper(MenuMapper.class).updateMenu(map);
	}

}
