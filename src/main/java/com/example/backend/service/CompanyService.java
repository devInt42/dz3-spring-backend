package com.example.backend.service;

import java.util.List;

import com.example.backend.dto.CompanyDto;

public interface CompanyService {
//   CompanyDto getCompany(int companyCode);
   List<CompanyDto> getCompanyList(CompanyDto dto);
   CompanyDto deleteById(int companyCode);
}
