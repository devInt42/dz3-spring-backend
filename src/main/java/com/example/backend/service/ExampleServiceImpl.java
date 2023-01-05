package com.example.backend.service;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.backend.dto.EmployeeDto;
import com.example.backend.mapper.ExampleMapper;

@Component
public class ExampleServiceImpl implements ExampleService {
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public EmployeeDto getEmployeeByCode(int employeeCode) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(ExampleMapper.class).getByCode(employeeCode);
	}

	@Override
	public List<EmployeeDto> getEmployeeList(EmployeeDto dto) {
		// TODO Auto-generated method stub
		System.out.println(dto);
		return sqlSession.getMapper(ExampleMapper.class).getList(dto);

	}

	// delete
	@Override
	public void removeEmployee(int employeeCode) {
		sqlSession.getMapper(ExampleMapper.class).remove(employeeCode);
	}
	
	// update set
	@Override
	public void setEmployee(Map<String, String> map) {
		sqlSession.getMapper(ExampleMapper.class).set(map);		
	}

	// insert into
	@Override
	public void addEmployee(Map<String, String> map) {
		sqlSession.getMapper(ExampleMapper.class).add(map);		
		
	}

}
