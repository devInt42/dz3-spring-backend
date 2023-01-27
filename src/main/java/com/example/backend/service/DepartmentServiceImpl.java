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
	public List<DepartmentDto> GetDepartmentList(DepartmentDto dto) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(DepartmentMapper.class).GetDepartmentList(dto);
	}

	@Override
	public List<DepartmentDto> GetCompanyList() {
		return sqlSession.getMapper(DepartmentMapper.class).GetCompanyList();
	}

	@Override
	public List<DepartmentDto> GetWorkplaceList() {
		return sqlSession.getMapper(DepartmentMapper.class).GetWorkplaceList();
	}

	@Override
	public Integer GetDepartmentCount(DepartmentDto dto) {
		return sqlSession.getMapper(DepartmentMapper.class).GetDepartmentCount(dto);
	}

	@Override
	public List<DepartmentDto> GetCompanyWorkplaceName(DepartmentDto dto) {
		return sqlSession.getMapper(DepartmentMapper.class).GetCompanyWorkplaceName(dto);
	}

	@Override
	public List<DepartmentDto> GetDepartment(int departmentSeq) {
		
		return sqlSession.getMapper(DepartmentMapper.class).GetDepartment(departmentSeq);
	}

	@Override
	public List<DepartmentDto> GetWorkplaceData(int workplaceSeq) {
		return sqlSession.getMapper(DepartmentMapper.class).GetWorkplaceData(workplaceSeq);
	}

	@Override
	public List<DepartmentDto> GetDepartmentParent(int workplaceSeq) {
		return sqlSession.getMapper(DepartmentMapper.class).GetDepartmentParent(workplaceSeq);
	}
}
