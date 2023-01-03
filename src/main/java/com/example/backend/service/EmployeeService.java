package com.example.backend.service;
import java.util.List;
import java.util.Map;

import com.example.backend.dto.EmployeeDto;

public interface EmployeeService {
	EmployeeDto getEmployeeByCode(int employeeCode);
	List<EmployeeDto> getEmployeeList(EmployeeDto dto);
	void removeEmployee(int employeeId);
	void setEmployee(Map<String, String> map);
	void addEmployee(Map<String, String> map);
}
