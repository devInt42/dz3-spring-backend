package com.example.backend.dto.mapping;

import lombok.Data;

@Data
public class DepartmentEmployeeDto {
	private int employeeSeq;
	private int workplaceSeq;
	private int departmentSeq;
	private int companySeq;
	private int subDepartmentSeq;
	private String title;
	private String employeeName;
	private String employeeId;
	private String employeePh;
	private String employeePicture;
	private String employeeCall;
	
	
	private int Page;
	private int startPgNum;
	private int endPgNum;
}
