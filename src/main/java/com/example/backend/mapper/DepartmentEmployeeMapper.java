package com.example.backend.mapper;

import java.util.List;

import com.example.backend.dto.mapping.DepartmentEmployeeDto;

public interface DepartmentEmployeeMapper {
	List<DepartmentEmployeeDto> getList(DepartmentEmployeeDto dto);

	DepartmentEmployeeDto getEmployeeInfo(DepartmentEmployeeDto dto);

	List<DepartmentEmployeeDto> getListByDepartment(DepartmentEmployeeDto dto);

	int getDepartmentCount(DepartmentEmployeeDto dto);

	int getEmployeeCount(DepartmentEmployeeDto dto);

	List<DepartmentEmployeeDto> getInfo(DepartmentEmployeeDto dto);

	List<DepartmentEmployeeDto> getCompanyElement(DepartmentEmployeeDto dto);

	List<DepartmentEmployeeDto> getWorkplaceList(DepartmentEmployeeDto dto);

	List<DepartmentEmployeeDto> getDepartmentList(DepartmentEmployeeDto dto);

	List<DepartmentEmployeeDto> getEmployeeList(DepartmentEmployeeDto dto);

	List<DepartmentEmployeeDto> getMyInfo(DepartmentEmployeeDto dto);

	List<DepartmentEmployeeDto> getListByAuth(DepartmentEmployeeDto dto);

	List<DepartmentEmployeeDto> getDepartmentGroup(DepartmentEmployeeDto dto);

	List<DepartmentEmployeeDto> getDepartmentName(DepartmentEmployeeDto dto);

	List<DepartmentEmployeeDto> getTree(DepartmentEmployeeDto dto);

	List<DepartmentEmployeeDto> getDeptTree(DepartmentEmployeeDto dto);

	List<DepartmentEmployeeDto> getBelongNames(DepartmentEmployeeDto dto);

	List<DepartmentEmployeeDto> getDepartmentSelectList(int companySeq);

	List<DepartmentEmployeeDto> getCompanyEmp(DepartmentEmployeeDto dto);

	List<DepartmentEmployeeDto> getAllCompany(DepartmentEmployeeDto dto);

	List<DepartmentEmployeeDto> getPosition();

	List<DepartmentEmployeeDto> getDuty();

	void updateGroupInfo(DepartmentEmployeeDto dto);
	
	void insertGroupInfo(DepartmentEmployeeDto dto);
	
	void insertBasicInfo(DepartmentEmployeeDto dto);
	
	void updateBasicInfo(DepartmentEmployeeDto dto);
	
	void insertCompanyGroupInfo(DepartmentEmployeeDto dto);
}
