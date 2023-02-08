package com.example.backend.service;

import java.util.List;

import com.example.backend.dto.mapping.CompanyEmployeeDto;

public interface CompanyEmployeeService {
	CompanyEmployeeDto checkLogin(CompanyEmployeeDto dto);

	CompanyEmployeeDto responseLogin(CompanyEmployeeDto dto);

	List<CompanyEmployeeDto> getCompanyList(CompanyEmployeeDto dto);

	List<CompanyEmployeeDto> getEmployeeList(CompanyEmployeeDto dto);

}
