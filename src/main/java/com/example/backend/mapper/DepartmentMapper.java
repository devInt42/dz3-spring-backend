package com.example.backend.mapper;

import java.util.List;

import com.example.backend.dto.DepartmentDto;

public interface DepartmentMapper {
	   List<DepartmentDto> GetDepartmentList(DepartmentDto dto);
	   List<DepartmentDto> GetCompanyList();
	   List<DepartmentDto> GetWorkplaceList();
	   Integer GetDepartmentCount(DepartmentDto dto);
	   List<DepartmentDto> GetCompanyWorkplaceName(DepartmentDto dto);
	   List<DepartmentDto> GetDepartment(int departmentSeq);
	   List<DepartmentDto> GetWorkplaceData(int workplaceSeq);
	   List<DepartmentDto> GetDepartmentParent(int workplaceSeq);
	   int DupliCheck(int departmentCode);
	   int NameDupliCheck(DepartmentDto dto);
	   void InsertDepartment(DepartmentDto dto);
}
