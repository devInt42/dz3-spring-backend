package com.example.backend.service;

import java.util.List;

import com.example.backend.dto.mapping.AuthEmployeeDto;

public interface AuthEmployeeService {
	List<AuthEmployeeDto> getAuthEmployeeList(int page, AuthEmployeeDto dto);

}
