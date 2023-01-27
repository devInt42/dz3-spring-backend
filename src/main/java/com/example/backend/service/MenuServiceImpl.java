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

	// 삽입 전 중복조회(메뉴코드)
	@Override
	public List<MenuDto> checkCode(String menuCode) {
		return sqlSession.getMapper(MenuMapper.class).checkCode(menuCode);
	}

	// 삽입 전 중복조회(메뉴이름)
	@Override
	public List<MenuDto> checkName(String menuName) {
		return sqlSession.getMapper(MenuMapper.class).checkName(menuName);
	}

	@Override
	public List<MenuDto> getAllMenuList() {
		return sqlSession.getMapper(MenuMapper.class).getAllList();
	}

	// 해당 시퀀스의 URL 조회
	@Override
	public String getURL(int menuSeq) {
		return sqlSession.getMapper(MenuMapper.class).getURL(menuSeq);
	}

	// 하위메뉴 개수 조회
	@Override
	public Integer countMenu(int menuSeq) {
		return sqlSession.getMapper(MenuMapper.class).countMenu(menuSeq);
	}

}
