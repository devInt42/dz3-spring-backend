package com.example.backend.service;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.backend.dto.mapping.AuthMenuDto;
import com.example.backend.mapper.AuthMenuMapper;

@Component
public class AuthMenuServiceImpl implements AuthMenuService {
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public AuthMenuDto getAuthMenuBySeq(Map<String, String> map) {
		return sqlSession.getMapper(AuthMenuMapper.class).getBySeq(map);
	}

	@Override
	public List<AuthMenuDto> getAuthMenuList(AuthMenuDto dto) {
		return sqlSession.getMapper(AuthMenuMapper.class).getList(dto);
	}

	@Override
	public void removeAuthMenu(Map<String, String> map) {
		sqlSession.getMapper(AuthMenuMapper.class).remove(map);
		
	}

	@Override
	public void setAuthMenu(Map<String, String> map) {
		sqlSession.getMapper(AuthMenuMapper.class).set(map);		
		
	}

	@Override
	public void addAuthMenu(Map<String, String> map) {
		sqlSession.getMapper(AuthMenuMapper.class).add(map);		
		
	}

	

}
