package com.example.backend.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.backend.dto.mapping.DepartmentEmployeeDto;
import com.example.backend.mapper.DepartmentEmployeeMapper;

@Component
public class DepartmentEmployeeServiceImpl implements DepartmentEmployeeService {
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<DepartmentEmployeeDto> getEmployeePage(int page, DepartmentEmployeeDto dto) {
		dto.setPage(page);
		dto.setStartPgNum(0+(page-1)*3);
		dto.setEndPgNum(3+(page-1)*3);
		return sqlSession.getMapper(DepartmentEmployeeMapper.class).getList(dto);
	}

	public List<DepartmentEmployeeDto> getEmployeePagebyDepartment(int page, DepartmentEmployeeDto dto) {
		dto.setPage(page);
		dto.setStartPgNum(0+(page-1)*5);
		dto.setEndPgNum(5+(page-1)*5);
		return sqlSession.getMapper(DepartmentEmployeeMapper.class).getListByDepartment(dto);
	}
	
}
