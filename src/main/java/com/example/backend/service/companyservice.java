package com.example.backend.service;

import java.util.List;

import com.example.backend.dto.CompanyDTO;

public interface companyservice {
	List <CompanyDTO> getCompanyInformation();
	CompanyDTO getCompanyInfo(int companySeq);
	
	void insertCompany( CompanyDTO dto);
	void updateCompany(CompanyDTO dto);
	void DeleteCompany(int companySeq);
}
