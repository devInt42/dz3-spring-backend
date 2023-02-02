package com.example.backend.service;


import java.util.List;

import com.example.backend.dto.EmployeeDto;

public interface EmployeeService {
	List<EmployeeDto> getEmpList();
	List<EmployeeDto> getEmployeeBySeq(int employeeSeq);
	List<String> getLanguage();
}
