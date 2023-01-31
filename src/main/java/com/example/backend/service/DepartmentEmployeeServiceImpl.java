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
	public List<DepartmentEmployeeDto> getEmployeePage(DepartmentEmployeeDto dto) {
		return sqlSession.getMapper(DepartmentEmployeeMapper.class).getList(dto);
	}

	@Override
	public List<DepartmentEmployeeDto> getEmployeePagebyDepartment(DepartmentEmployeeDto dto) {

		return sqlSession.getMapper(DepartmentEmployeeMapper.class).getListByDepartment(dto);
	}

	@Override
	public int getEmployeeCountByDepartment(DepartmentEmployeeDto dto) {
		return sqlSession.getMapper(DepartmentEmployeeMapper.class).getEmployeeCount(dto);

	}

	@Override
	public List<DepartmentEmployeeDto> getCompanyElement(DepartmentEmployeeDto dto) {
		return sqlSession.getMapper(DepartmentEmployeeMapper.class).getCompanyElement(dto);
	}

	@Override
	public List<DepartmentEmployeeDto> getWorkplaceInfo(DepartmentEmployeeDto dto) {
		return sqlSession.getMapper(DepartmentEmployeeMapper.class).getWorkplaceList(dto);
	}

	@Override
	public DepartmentEmployeeDto getEmployeeInfo(DepartmentEmployeeDto dto) {
		return sqlSession.getMapper(DepartmentEmployeeMapper.class).getInfo(dto);

	}

	@Override
	public List<DepartmentEmployeeDto> getDepartmentInfo(DepartmentEmployeeDto dto) {
		return sqlSession.getMapper(DepartmentEmployeeMapper.class).getDepartmentList(dto);
	}

	@Override
	public List<DepartmentEmployeeDto> getmyInfo(DepartmentEmployeeDto dto) {
		return sqlSession.getMapper(DepartmentEmployeeMapper.class).getMyInfo(dto);
	}

	@Override
	public List<DepartmentEmployeeDto> getAuthInfo(DepartmentEmployeeDto dto) {
		return sqlSession.getMapper(DepartmentEmployeeMapper.class).getListByAuth(dto);
	}

	@Override
	public List<DepartmentEmployeeDto> getDepartmentGroup(DepartmentEmployeeDto dto) {
		return sqlSession.getMapper(DepartmentEmployeeMapper.class).getDepartmentGroup(dto);
	}

	@Override
	public int getDepartmentCount(DepartmentEmployeeDto dto) {
		return sqlSession.getMapper(DepartmentEmployeeMapper.class).getDepartmentCount(dto);
	}

}
