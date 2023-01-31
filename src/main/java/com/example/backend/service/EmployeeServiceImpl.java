package com.example.backend.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.backend.dto.EmployeeDto;
import com.example.backend.mapper.EmployeeMapper;

@Component
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private SqlSessionTemplate sqlSession;


	@Override
	public List<EmployeeDto> getEmpList() {
		return sqlSession.getMapper(EmployeeMapper.class).getEmpList();
	}

	@Override
	public List<EmployeeDto> getEmployeeBySeq(int employeeSeq) {
		return sqlSession.getMapper(EmployeeMapper.class).getBySeq(employeeSeq);
	}
}
