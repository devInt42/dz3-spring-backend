package com.example.backend.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.backend.dto.CompanyDto;

@Component
public class CompanyServiceImpl implements CompanyService {

	@Override
	public List<CompanyDto> getCompanyInformation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompanyDto getCompanyInfo(int companySeq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int DupliCheck(int companyCode) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void insertCompany(CompanyDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCompany(CompanyDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteCompany(int companySeq) {
		// TODO Auto-generated method stub
		
	}
	
//	@Autowired
//	private SqlSessionTemplate sqlSession;

	

}
