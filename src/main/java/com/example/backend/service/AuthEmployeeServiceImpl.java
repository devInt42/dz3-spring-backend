package com.example.backend.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.backend.dto.mapping.AuthEmployeeDto;
import com.example.backend.mapper.AuthEmployeeMapper;

@Component
public class AuthEmployeeServiceImpl implements AuthEmployeeService {
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<AuthEmployeeDto> getAuthEmployeeList(int page, AuthEmployeeDto dto) {
		dto.setPage(page);
		dto.setStartPgNum(0+(page-1)*10);
		dto.setEndPgNum(9+(page-1)*10);
		return sqlSession.getMapper(AuthEmployeeMapper.class).getAuthListByCompany(dto);
	}

	

}
