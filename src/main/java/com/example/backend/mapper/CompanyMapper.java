package com.example.backend.mapper;

import java.util.List;

import com.example.backend.dto.CompanyDto;

public interface CompanyMapper {
	List<CompanyDto> getallCompanyInfo();
	CompanyDto getCompanyInfo(int companySeq);
	
	void insertCompanyInfo( CompanyDto dto);
	void updateCompany(CompanyDto dto);
	void DeleteCompany(int companySeq);
}