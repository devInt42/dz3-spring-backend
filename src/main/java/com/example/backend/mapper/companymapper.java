package com.example.backend.mapper;

import java.util.List;

import com.example.backend.dto.CompanyDTO;

public interface companymapper {
	List<CompanyDTO> getallCompanyInfo();
	CompanyDTO getCompanyInfo(int companySeq);
	
	void insertCompanyInfo( CompanyDTO dto);
	void updateCompany(CompanyDTO dto);
	void DeleteCompany(int companySeq);
}
