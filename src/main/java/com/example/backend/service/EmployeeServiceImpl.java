package com.example.backend.service;

import java.util.List;
import java.util.Map;

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
	public EmployeeDto getEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(EmployeeMapper.class).getById(employeeId);
	}

	@Override
	public List<EmployeeDto> getEmployeeList(EmployeeDto dto) {
		// TODO Auto-generated method stub
		System.out.println(dto);
		return sqlSession.getMapper(EmployeeMapper.class).getList(dto);

	}

	// delete
	@Override
	public void removeEmployee(int employeeId) {
		sqlSession.getMapper(EmployeeMapper.class).remove(employeeId);
	}
	
	// update set
	@Override
	public void setEmployee(Map<String, String> map) {
		sqlSession.getMapper(EmployeeMapper.class).set(map);		
	}

	// insert into
	@Override
	public void addEmployee(Map<String, String> map) {
		sqlSession.getMapper(EmployeeMapper.class).add(map);		
		
	}

}
