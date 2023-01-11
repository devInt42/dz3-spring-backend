package com.example.backend.mapper;

import java.util.List;

import com.example.backend.dto.mapping.AuthEmployeeDto;

public interface AuthEmployeeMapper {
	List<AuthEmployeeDto> getAuthListByCompany(AuthEmployeeDto dto);
	List<AuthEmployeeDto> getAuthListByAuth(AuthEmployeeDto dto);
	int getCountByCompany(AuthEmployeeDto dto);
}
