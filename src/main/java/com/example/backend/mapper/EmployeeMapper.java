package com.example.backend.mapper;

import java.util.List;
import java.util.Map;

import com.example.backend.dto.EmployeeDto;

public interface EmployeeMapper {

	List<EmployeeDto> getEmpList();
	List<EmployeeDto> getBySeq(int employeeSeq);
	List<String> getLanguage();
	List<EmployeeDto> checkId(String employeeId);
	List<EmployeeDto> checkCmail(String employeeCmail);
	
	void insertEmp(Map<String, String> map);
	void deleteEmp(int employeeSeq);
	void updateEmp(Map<String, String> map);
}
