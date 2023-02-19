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
	public List<DepartmentEmployeeDto> getEmployeeInfo(DepartmentEmployeeDto dto) {
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

	@Override
	public DepartmentEmployeeDto getSelectEmployeeInfo(DepartmentEmployeeDto dto) {
		return sqlSession.getMapper(DepartmentEmployeeMapper.class).getEmployeeInfo(dto);
	}

	@Override
	public List<DepartmentEmployeeDto> getEmployeeDepartmentTree(DepartmentEmployeeDto dto) {
		return sqlSession.getMapper(DepartmentEmployeeMapper.class).getTree(dto);
	}

	public List<DepartmentEmployeeDto> getBelongNames(DepartmentEmployeeDto dto) {

		return sqlSession.getMapper(DepartmentEmployeeMapper.class).getBelongNames(dto);
	}

	@Override
	public List<DepartmentEmployeeDto> getDepartmentSelectList(int companySeq) {
		return sqlSession.getMapper(DepartmentEmployeeMapper.class).getDepartmentSelectList(companySeq);
	}

	@Override
	public List<DepartmentEmployeeDto> getCompanyEmp(DepartmentEmployeeDto dto) {
		return sqlSession.getMapper(DepartmentEmployeeMapper.class).getCompanyEmp(dto);
	}

	@Override
	public List<DepartmentEmployeeDto> getDeptTree(DepartmentEmployeeDto dto) {
		return sqlSession.getMapper(DepartmentEmployeeMapper.class).getDeptTree(dto);
	}

	@Override
	public List<DepartmentEmployeeDto> getAllCompany(DepartmentEmployeeDto dto) {
		return sqlSession.getMapper(DepartmentEmployeeMapper.class).getAllCompany(dto);

	}

	public List<DepartmentEmployeeDto> getPosition() {
		return sqlSession.getMapper(DepartmentEmployeeMapper.class).getPosition();
	}

	@Override
	public List<DepartmentEmployeeDto> getDuty() {
		return sqlSession.getMapper(DepartmentEmployeeMapper.class).getDuty();
	}

	@Override
	public void updateGroupInfo(DepartmentEmployeeDto dto) {
		sqlSession.getMapper(DepartmentEmployeeMapper.class).updateGroupInfo(dto);
	}

	@Override
	public void insertGroupInfo(DepartmentEmployeeDto dto) {
		sqlSession.getMapper(DepartmentEmployeeMapper.class).insertGroupInfo(dto);
	}

	@Override
	public void insertBasicInfo(DepartmentEmployeeDto dto) {
		sqlSession.getMapper(DepartmentEmployeeMapper.class).insertBasicInfo(dto);
	}

	@Override
	public void updateBasicInfo(DepartmentEmployeeDto dto) {
		sqlSession.getMapper(DepartmentEmployeeMapper.class).updateBasicInfo(dto);
	}

	@Override
	public void insertCompanyGroupInfo(DepartmentEmployeeDto dto) {
		sqlSession.getMapper(DepartmentEmployeeMapper.class).insertCompanyGroupInfo(dto);
	}

	@Override
	public int getInsertSeq(DepartmentEmployeeDto dto) {
		return sqlSession.getMapper(DepartmentEmployeeMapper.class).getInsertSeq(dto);
	}

	@Override
	public void updateCompanyGroupInfo(DepartmentEmployeeDto dto) {
		sqlSession.getMapper(DepartmentEmployeeMapper.class).updateCompanyGroupInfo(dto);
	}

}