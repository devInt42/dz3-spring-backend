package com.example.backend.service;

import java.util.List;

import com.example.backend.dto.mapping.DepartmentEmployeeDto;

public interface DepartmentEmployeeService {
	List<DepartmentEmployeeDto> getEmployeePage(DepartmentEmployeeDto dto);

	List<DepartmentEmployeeDto> getEmployeePagebyDepartment(DepartmentEmployeeDto dto);

	int getEmployeeCountByDepartment(DepartmentEmployeeDto dto);

	List<DepartmentEmployeeDto> getEmployeeInfo(DepartmentEmployeeDto dto);

	List<DepartmentEmployeeDto> getCompanyElement(DepartmentEmployeeDto dto);

	List<DepartmentEmployeeDto> getWorkplaceInfo(DepartmentEmployeeDto dto);

	List<DepartmentEmployeeDto> getDepartmentInfo(DepartmentEmployeeDto dto);

	List<DepartmentEmployeeDto> getmyInfo(DepartmentEmployeeDto dto);

	List<DepartmentEmployeeDto> getAuthInfo(DepartmentEmployeeDto dto);

	List<DepartmentEmployeeDto> getDepartmentGroup(DepartmentEmployeeDto dto);

	int getDepartmentCount(DepartmentEmployeeDto dto);

	DepartmentEmployeeDto getSelectEmployeeInfo(DepartmentEmployeeDto dto);

	List<DepartmentEmployeeDto> getEmployeeDepartmentTree(DepartmentEmployeeDto dto);

	DepartmentEmployeeDto getBelongNames(int employeeSeq);

	List<DepartmentEmployeeDto> getDepartmentSelectList(int companySeq);
}
