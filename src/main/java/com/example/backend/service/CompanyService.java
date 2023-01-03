package com.example.backend.service;

import java.util.List;
import java.util.Map;

import com.example.backend.dto.CompanyDto;

public interface CompanyService {
	List <CompanyDto> getCompanyInformation();
	CompanyDto getCompanyInfo(int company_code);
	
	void insertCompany( CompanyDto dto);
}
