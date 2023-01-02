package com.example.backend.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.backend.dto.CompanyDto;
import com.example.backend.mapper.CompanyMapper;

@Component
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public CompanyDto getCompany(int companyCode) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(CompanyMapper.class).get(companyCode);
	}

	@Override
	public List<CompanyDto> getCompanyList(CompanyDto dto) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(CompanyMapper.class).getCompanyList(dto);
	}


}
