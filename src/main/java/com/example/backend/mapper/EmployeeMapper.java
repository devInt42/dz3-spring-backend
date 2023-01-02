package com.example.backend.mapper;

import java.util.List;
import java.util.Map;

import com.example.backend.dto.EmployeeDto;

public interface EmployeeMapper {
	List<EmployeeDto> getList(EmployeeDto dto);
	EmployeeDto getById(int employeeId);
	void remove(int employeeId);
	void add(Map<String, String> map);
	void set(Map<String, String> map);
}
