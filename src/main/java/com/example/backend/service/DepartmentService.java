package com.example.backend.service;

import java.util.List;

import com.example.backend.dto.DepartmentDto;

public interface DepartmentService {
	List<DepartmentDto> getDepartmentList(DepartmentDto dto);

	List<DepartmentDto> GetDepartmentList(DepartmentDto dto);

	List<DepartmentDto> GetCompany(int companySeq);
	
	List<DepartmentDto> GetCompanyList(int companySeq);

	List<DepartmentDto> GetWorkplaceList();

	Integer GetDepartmentCount(DepartmentDto dto);

	List<DepartmentDto> GetCompanyWorkplaceName(DepartmentDto dto);

	List<DepartmentDto> GetDepartment(int departmentSeq);

	List<DepartmentDto> GetWorkplaceData(int workplaceSeq);

	List<DepartmentDto> GetDepartmentParent(int workplaceSeq);
	
	int DupliCheck(DepartmentDto dto);

	int NameDupliCheck(DepartmentDto dto);

	void InsertDepartment(DepartmentDto dto);

	void UpdateDepartment(DepartmentDto dto);

	void DeleteDepartment(int seq);

	List<DepartmentDto> FindDepartment(DepartmentDto dto);
}
