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
	public List<DepartmentDto> getDepartmentList(DepartmentDto dto) {
		// TODO Auto-generated method stub
		 return sqlSession.getMapper(DepartmentMapper.class).getList(dto);	}

	

}
