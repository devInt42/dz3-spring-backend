package com.example.backend.mapper;

import java.util.List;

import com.example.backend.dto.mapping.CompanyEmployeeDto;

public interface CompanyEmployeeMapper {
	CompanyEmployeeDto check(CompanyEmployeeDto dto);

	CompanyEmployeeDto response(CompanyEmployeeDto dto);

	List<CompanyEmployeeDto> getList(CompanyEmployeeDto dto);

	List<CompanyEmployeeDto> getEmployeeList(CompanyEmployeeDto dto);

	List<CompanyEmployeeDto> getAllList(CompanyEmployeeDto dto);

}
