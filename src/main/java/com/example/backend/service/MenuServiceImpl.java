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
	
	@Override
	public MenuDto getMenuBySeq(int menuSeq) {
		return sqlSession.getMapper(MenuMapper.class).getBySeq(menuSeq);
	}

	@Override
	public List<MenuDto> getMenuList(MenuDto dto) {
		return sqlSession.getMapper(MenuMapper.class).getList(dto);
	}
	

	@Override
	public void removeMenu(int menuSeq) {
		sqlSession.getMapper(MenuMapper.class).remove(menuSeq);

	}

	@Override
	public void setMenu(Map<String, String> map) {
		sqlSession.getMapper(MenuMapper.class).set(map);		

	}

	@Override
	public void addMenu(Map<String, String> map) {
		sqlSession.getMapper(MenuMapper.class).add(map);		
		
	}

}
