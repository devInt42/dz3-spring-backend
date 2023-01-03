package com.example.backend.mapper;

import java.util.List;

import com.example.backend.dto.CompanyDto;

public interface CompanyMapper {
	List<CompanyDto> getallCompanyInfo();
	CompanyDto getCompanyInfo(int company_code);
	
	void insertCompanyInfo( CompanyDto dto);
}
