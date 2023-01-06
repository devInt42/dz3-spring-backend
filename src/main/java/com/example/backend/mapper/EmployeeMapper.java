package com.example.backend.mapper;

import com.example.backend.dto.EmployeeDto;

public interface EmployeeMapper {
	EmployeeDto getBySeq(int employeeSeq);
}
