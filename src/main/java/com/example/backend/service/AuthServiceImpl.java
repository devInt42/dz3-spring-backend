package com.example.backend.service;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.backend.dto.AuthDto;
import com.example.backend.mapper.AuthMapper;

@Component
public class AuthServiceImpl implements AuthService {
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public AuthDto getAuthBySeq(int authSeq) {
		return sqlSession.getMapper(AuthMapper.class).getBySeq(authSeq);
	}

	@Override
	public List<AuthDto> getAuthList(int page, AuthDto dto) {
		dto.setPage(page);
		dto.setStartPgNum(0+(page-1)*10);
		dto.setEndPgNum(10+(page-1)*10);
		return sqlSession.getMapper(AuthMapper.class).getList(dto);
	}

	@Override
	public void removeAuth(int authSeq) {
		sqlSession.getMapper(AuthMapper.class).remove(authSeq);
	}

	@Override
	public void setAuth(Map<String, String> map) {
		sqlSession.getMapper(AuthMapper.class).set(map);		

	}

	@Override
	public void addAuth(Map<String, String> map) {
		sqlSession.getMapper(AuthMapper.class).add(map);		
	}

}
