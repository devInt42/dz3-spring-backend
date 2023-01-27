package com.example.backend.service;

import java.util.List;

import com.example.backend.dto.CompanyDto;

public interface CompanyService {
	List <CompanyDto> getCompanyInformation();
	CompanyDto getCompanyInfo(int companySeq);
	int DupliCheck(int companyCode);
	void insertCompany( CompanyDto dto);
	void updateCompany(CompanyDto dto);
	void DeleteCompany(int companySeq);
}