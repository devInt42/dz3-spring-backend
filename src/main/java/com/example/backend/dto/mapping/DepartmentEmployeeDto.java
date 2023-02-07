package com.example.backend.dto.mapping;

import java.sql.Date;

import lombok.Data;

@Data
public class DepartmentEmployeeDto {
	private int employeeSeq;
	private int workplaceSeq;
	private int departmentSeq;
	private int companySeq;
	private int subDepartmentSeq;
	private String companyCode;
	private String title;
	private String employeeName;
	private String employeeId;
	private String employeePh;
	private String employeePicture;
	private String employeeCall;
	private String employeePmail;
	private String employeeCmail;
	private String companyName;
	private String workplaceName;
	private String departmentName;
	private Date employeeBirth;
	private int authSeq;
	private String duty;
	private String position;
	private int Page;
	private int startPgNum;
	private int endPgNum;
	
	private int departmentDepth;
	private int departmentParent;
}
