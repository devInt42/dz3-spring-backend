package com.example.backend.mapper;

import java.util.List;
import java.util.Map;

import com.example.backend.dto.CompanyDto;
//dao
public interface CompanyMapper {
	List<CompanyDto> getList (CompanyDto dto); //list 값
	CompanyDto get(int companyCode); //get 
	List<CompanyDto> getCompanyList(CompanyDto dto);//List
	void delete(int companyCode); //delete
	void add(Map<String, String> map);
	void set(Map<String, String> map);
}
