package com.example.backend.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.backend.dto.EmployeeDto;
import com.example.backend.mapper.EmployeeMapper;
import com.example.backend.mapper.ExampleMapper;

@Component
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public EmployeeDto getEmployeeBySeq(int employeeSeq) {
		return sqlSession.getMapper(EmployeeMapper.class).getBySeq(employeeSeq);
	}

}
