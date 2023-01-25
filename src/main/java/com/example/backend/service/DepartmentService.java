package com.example.backend.service;

import java.util.List;

import com.example.backend.dto.DepartmentDto;

public interface DepartmentService {
	   List<DepartmentDto> GetDepartmentList();
	   List<DepartmentDto> GetCompanyList();
	   List<DepartmentDto> GetWorkplaceList();
}
