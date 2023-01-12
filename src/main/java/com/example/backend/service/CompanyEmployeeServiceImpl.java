package com.example.backend.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.backend.dto.mapping.CompanyEmployeeDto;
import com.example.backend.mapper.CompanyEmployeeMapper;

@Component
public class CompanyEmployeeServiceImpl implements CompanyEmployeeService {
	@Autowired
	private SqlSessionTemplate sqlSession;

	public CompanyEmployeeDto checkLogin(CompanyEmployeeDto dto) {
		return sqlSession.getMapper(CompanyEmployeeMapper.class).check(dto);
	}

}
