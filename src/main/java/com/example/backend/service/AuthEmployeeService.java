package com.example.backend.service;

import java.util.List;

import com.example.backend.dto.mapping.AuthEmployeeDto;

public interface AuthEmployeeService {
	List<AuthEmployeeDto> getAuthCompanyList(int page, AuthEmployeeDto dto);
	List<AuthEmployeeDto> getAuthEmployeeList(int page, AuthEmployeeDto dto);
	int getAuthCountByCompany(AuthEmployeeDto dto);
}
