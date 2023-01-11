package com.example.backend.mapper;

import java.util.List;

import com.example.backend.dto.mapping.DepartmentEmployeeDto;

public interface DepartmentEmployeeMapper {
	List<DepartmentEmployeeDto> getList(DepartmentEmployeeDto dto);
	List<DepartmentEmployeeDto> getListByDepartment(DepartmentEmployeeDto dto);

}
