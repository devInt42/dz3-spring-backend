package com.example.backend.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.backend.dto.EmployeeDto;

public interface EmployeeMapper {
	List<EmployeeDto> getList(EmployeeDto dto);
	EmployeeDto get(int employeeId);
}
