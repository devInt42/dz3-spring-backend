package com.example.backend.service;

import java.util.List;

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
	public List<MenuDto> getMenuList() {
		return sqlSession.getMapper(MenuMapper.class).getMenuList();
	}

}
