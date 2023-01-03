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
	public List<CompanyDto> getCompanyInformation() {
		return sqlSession.getMapper(CompanyMapper.class).getallCompanyInfo();
	}

	@Override
	public CompanyDto getCompanyInfo(int company_code) {
		return sqlSession.getMapper(CompanyMapper.class).getCompanyInfo(company_code);
	}

	@Override
	public void insertCompany( CompanyDto dto) {
		sqlSession.getMapper(CompanyMapper.class).insertCompanyInfo(dto);
	}

}
