package com.example.backend.service;

import java.util.List;

import com.example.backend.dto.mapping.AuthEmployeeDto;

public interface AuthEmployeeService {
	List<AuthEmployeeDto> getAuthCompanyList(int page, AuthEmployeeDto dto);
	List<AuthEmployeeDto> getAuthEmployeeList(AuthEmployeeDto dto);
	int getAuthCountByCompany(AuthEmployeeDto dto);
	List<AuthEmployeeDto> getOriginCode(AuthEmployeeDto dto);
	void addAuthEmployee(List<Object> list);
	void deleteAuthEmployee(List<Object> list);
	List<AuthEmployeeDto> getMenuListByAuthEmployee(AuthEmployeeDto dto);
	int checkAvailability(AuthEmployeeDto dto);
}
