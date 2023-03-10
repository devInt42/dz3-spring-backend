package com.example.backend.dto.mapping;

import java.sql.Date;
import java.util.List;

import lombok.Data;

@Data
public class DepartmentEmployeeDto {
	private List<DepartmentEmployeeDto> groupData;
	private List<DepartmentEmployeeDto> groupFirstData;
	private int employeeSeq;
	private int workplaceSeq;
	private int departmentSeq;
	private int companySeq;
	private String companyCode;
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
	private String mainCompany;
	private String mainDepartment;
	private int Page;
	private int startPgNum;
	private int endPgNum;
	private String mainCompanyYN;
	private String mainDepartmentYN;
	private String departmentLoc;
	private String departmentCall;
	private String departmentFax;
	private int departmentDepth;
	private int departmentParent;
	private	String departmentZipCode;
	private String dutyCode;
	private String positionCode;
	private String employeeCode;
	private Date employeeJoin;
	private Date employeeLeave;
	private String employeeClassification;
	private String companyHomepage;
	private String insertData;
	private String employeePwd;
	private String approvalPwd;
	private String employeeAddr;
	private String useYN;
	private String employeeGender;
	private String employeeLanguage;
	private String employeeHCall;
	private int firstDepartmentSeq;
	private int firstCompanySeq;
	private int firstWorkplaceSeq;
}
