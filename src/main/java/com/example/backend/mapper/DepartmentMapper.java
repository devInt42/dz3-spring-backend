package com.example.backend.mapper;

import java.util.List;

import com.example.backend.dto.DepartmentDto;

public interface DepartmentMapper {
	   List<DepartmentDto> GetDepartmentList(DepartmentDto dto);
	   List<DepartmentDto> GetCompanyList();
	   List<DepartmentDto> GetWorkplaceList();
	   Integer GetDepartmentCount(DepartmentDto dto);
}
