package com.example.backend.mapper;

import java.util.List;

import com.example.backend.dto.mapping.DepartmentEmployeeDto;

public interface DepartmentEmployeeMapper {
	List<DepartmentEmployeeDto> getList(DepartmentEmployeeDto dto);
	List<DepartmentEmployeeDto> getListByDepartment(DepartmentEmployeeDto dto);
	int getDepartmentCount(DepartmentEmployeeDto dto);
	int getEmployeeCount(DepartmentEmployeeDto dto);
	List<DepartmentEmployeeDto> getCompanyElement (DepartmentEmployeeDto dto);
	List<DepartmentEmployeeDto> getWorkplaceList(DepartmentEmployeeDto dto);
	List<DepartmentEmployeeDto> getDepartmentList(DepartmentEmployeeDto dto);
	List<DepartmentEmployeeDto> getEmployeeList(DepartmentEmployeeDto dto);
	List<DepartmentEmployeeDto> getMyInfo(DepartmentEmployeeDto dto);

}
