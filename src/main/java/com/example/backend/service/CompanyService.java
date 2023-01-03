package com.example.backend.service;

import java.util.List;
import java.util.Map;

import com.example.backend.dto.CompanyDto;

public interface CompanyService {
   CompanyDto getCompany(int companyCode);
   List<CompanyDto> getCompanyList(CompanyDto dto);
   void removeCompany(int companyCode);
   void addCompany (Map<String,String> map);
   void setCompany (Map<String,String> map);
}
