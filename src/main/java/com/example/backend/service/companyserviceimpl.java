package com.example.backend.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.backend.dto.CompanyDTO;
import com.example.backend.mapper.companymapper;


@Component
public class companyserviceimpl implements companyservice {

	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<CompanyDTO> getCompanyInformation() {
		return sqlSession.getMapper(companymapper.class).getallCompanyInfo();
	}

	@Override
	public CompanyDTO getCompanyInfo(int companySeq) {
		return sqlSession.getMapper(companymapper.class).getCompanyInfo(companySeq);
	}

	@Override
	public void insertCompany( CompanyDTO dto) {
		sqlSession.getMapper(companymapper.class).insertCompanyInfo(dto);
	}

	@Override
	public void updateCompany(CompanyDTO dto) {
		sqlSession.getMapper(companymapper.class).updateCompany(dto);
		
	}

	@Override
	public void DeleteCompany(int companySeq) {
		sqlSession.getMapper(companymapper.class).DeleteCompany(companySeq);
	}

}
