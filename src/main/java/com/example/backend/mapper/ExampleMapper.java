package com.example.backend.mapper;

import java.util.List;
import java.util.Map;

import com.example.backend.dto.EmployeeDto;

public interface ExampleMapper {
	List<EmployeeDto> getList(EmployeeDto dto);
	EmployeeDto getByCode(int employeeCode);
	void remove(int employeeId);
	void add(Map<String, String> map);
	void set(Map<String, String> map);
}
