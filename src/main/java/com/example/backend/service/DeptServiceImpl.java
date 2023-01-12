package com.example.backend.service;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.backend.dto.DeptDto;
import com.example.backend.mapper.DeptMapper;

@Component
public class DeptServiceImpl implements DeptService {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<DeptDto> getDeptList() {
		return sqlSession.getMapper(DeptMapper.class).getList();
	}

	@Override
	public void insertDept(Map<String, String> map) {
		sqlSession.getMapper(DeptMapper.class).insertDept(map);

	}

	@Override
	public int deleteDept(int dept_code) {
		return sqlSession.getMapper(DeptMapper.class).deleteDept(dept_code);
	}

	@Override
	public int updateDept(DeptDto dto) {
		return sqlSession.getMapper(DeptMapper.class).updateDept(dto);
	}

	@Override
	public List<DeptDto> getSearchDept(int dept_code) {
		return sqlSession.getMapper(DeptMapper.class).getSearchDept(dept_code);
	}

}
