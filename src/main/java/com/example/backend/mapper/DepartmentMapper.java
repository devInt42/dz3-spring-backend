package com.example.backend.mapper;

import java.util.List;

import com.example.backend.dto.DepartmentDto;

public interface DepartmentMapper {
	   List<DepartmentDto> GetDepartmentList();
	   List<DepartmentDto> GetCompanyList();
	   List<DepartmentDto> GetWorkplaceList();
}
