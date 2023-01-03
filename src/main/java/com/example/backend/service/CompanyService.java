package com.example.backend.service;

import java.util.List;

import com.example.backend.dto.CompanyDto;

public interface CompanyService {
	List <CompanyDto> getCompanyInformation();
	CompanyDto getCompanyInfo(int company_code);
	
	void insertCompany( CompanyDto dto);
	void updateCompany(CompanyDto dto);
	void DeleteCompany(int company_code);
}
