package com.example.backend.service;

import java.util.List;

import com.example.backend.dto.mapping.AuthEmployeeDto;
import com.example.backend.dto.mapping.DepartmentEmployeeDto;

public interface DepartmentEmployeeService {
	List<DepartmentEmployeeDto>getEmployeePage(DepartmentEmployeeDto dto);
	List<DepartmentEmployeeDto> getEmployeePagebyDepartment(DepartmentEmployeeDto dto);
	int getEmployeeCountByDepartment(DepartmentEmployeeDto dto);
	List<DepartmentEmployeeDto>getCompanyElement(DepartmentEmployeeDto dto);
	List<DepartmentEmployeeDto>getWorkplaceInfo(DepartmentEmployeeDto dto);
	List<DepartmentEmployeeDto>getDepartmentInfo(DepartmentEmployeeDto dto);

}
