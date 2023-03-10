package com.example.backend.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class EmployeeDto {
	private int employeeSeq;
	private String employeeId;
	private String employeeName;
	private Date employeeBirth;
	private Date employeeJoin;
	private Date employeeLeave;
	private String employeeCall;
	private String employeePwd;
	private String employeePh;
	private String employeePmail;
	private String employeeCmail;
	private String employeeAddr;
	private String employeePicture;
	private String useYN;
	private String employeeGender;
	private String employeeLanguage;
	private String employeeHCall;
	private String approvalPwd;
}