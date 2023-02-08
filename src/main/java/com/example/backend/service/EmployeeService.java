package com.example.backend.service;


import java.util.List;
import java.util.Map;

import com.example.backend.dto.EmployeeDto;

public interface EmployeeService {
	List<EmployeeDto> getEmpList();
	List<EmployeeDto> getEmployeeBySeq(int employeeSeq);
	List<String> getLanguage();
	List<EmployeeDto> checkId(String employeeId);
	
	void insertEmp(Map<String, String> map);
	void updateEmp(Map<String, String> map);
	void deleteEmp(int employeeSeq);
}
