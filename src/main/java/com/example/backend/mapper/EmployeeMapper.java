package com.example.backend.mapper;

import java.util.List;

import com.example.backend.dto.EmployeeDto;

public interface EmployeeMapper {

	List<EmployeeDto> getEmpList();
	List<EmployeeDto> getBySeq(int employeeSeq);
	List<String> getLanguage();
}
