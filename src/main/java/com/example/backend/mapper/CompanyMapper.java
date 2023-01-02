package com.example.backend.mapper;

import java.util.List;

import com.example.backend.dto.CompanyDto;
//dao
public interface CompanyMapper {
	List<CompanyDto> getList (CompanyDto dto); //list 값
	CompanyDto get(int companyCode); //get 
	List<CompanyDto> getCompanyList(CompanyDto dto);//List
	CompanyDto delete(int companyCode); //delete
}
