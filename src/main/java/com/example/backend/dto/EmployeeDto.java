package com.example.backend.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class EmployeeDto {
	private int employeeSeq;
	private int employeeCode;
	private String employeeId;
	private String employeeName;
	private Date employeeBirth;
	private String employeeCall;
	private String employeePwd;
	private String employeePh;
	private String employeePmail;
	private String employeeCmail;
	private String employeeAddr;
	private String employeePicture;
	private Date employeeJoin;
	private Date employeeLeave;
	private String useYN;

}
