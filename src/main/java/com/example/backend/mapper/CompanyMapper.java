package com.example.backend.mapper;

import java.util.List;

import com.example.backend.dto.CompanyDto;
//dao
public interface CompanyMapper {
	List<CompanyDto> getList (CompanyDto dto); //list 값
	CompanyDto get(int companyCode); //get 
//	int delete(int companyCode); //delete 
	List<CompanyDto> getCompanyList(CompanyDto dto);//List
}
