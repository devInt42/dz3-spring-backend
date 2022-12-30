package com.example.backend.service;
import java.util.List;

import com.example.backend.dto.EmployeeDto;

public interface EmployeeService {
	EmployeeDto getEmployee(int employeeId);
	List<EmployeeDto> getEmployeeList(EmployeeDto dto);
}
