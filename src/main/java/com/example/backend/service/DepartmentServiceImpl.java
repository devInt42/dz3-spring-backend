package com.example.backend.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.backend.dto.DepartmentDto;
import com.example.backend.mapper.DepartmentMapper;

@Component
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<DepartmentDto> GetDepartmentList() {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(DepartmentMapper.class).GetDepartmentList();
	}

	@Override
	public List<DepartmentDto> GetCompanyList() {
		return sqlSession.getMapper(DepartmentMapper.class).GetCompanyList();
	}

	@Override
	public List<DepartmentDto> GetWorkplaceList() {
		return sqlSession.getMapper(DepartmentMapper.class).GetWorkplaceList();
	}
}
