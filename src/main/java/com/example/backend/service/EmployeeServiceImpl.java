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
	public List<EmployeeDto> getEmpList() {
		return sqlSession.getMapper(EmployeeMapper.class).getEmpList();
	}

	@Override
	public List<EmployeeDto> getEmployeeBySeq(int employeeSeq) {
		return sqlSession.getMapper(EmployeeMapper.class).getBySeq(employeeSeq);
	}

	@Override
	public List<String> getLanguage() {
		return sqlSession.getMapper(EmployeeMapper.class).getLanguage();
	}

	@Override
	public void insertEmp(Map<String, String> map) {
		sqlSession.getMapper(EmployeeMapper.class).insertEmp(map);
	}

	@Override
	public void updateEmp(Map<String, String> map) {
		sqlSession.getMapper(EmployeeMapper.class).updateEmp(map);
	}

	@Override
	public void deleteEmp(int employeeSeq) {
		sqlSession.getMapper(EmployeeMapper.class).deleteEmp(employeeSeq);
	}
}
