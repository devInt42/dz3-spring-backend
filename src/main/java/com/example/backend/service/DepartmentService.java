package com.example.backend.service;

import java.util.List;

import com.example.backend.dto.DepartmentDto;

public interface DepartmentService {
	   List<DepartmentDto> getDepartmentList(DepartmentDto dto);
}