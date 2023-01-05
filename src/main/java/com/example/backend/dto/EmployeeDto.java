package com.example.backend.dto;

import java.util.Date;

import lombok.Data;

@Data
public class EmployeeDto {
	private int employeeSeq;
	private int employeeCode;
	private String employeeId;
	private String employeeName;
	private String employeeBirth;
	private String employeeCall;
	private String employeePwd;
	private String employeePh;
	private String employeePmail;
	private String employeeCmail;
	private String employeeAddr;
	private String employeePicture;
	private Date employeeJoin;
	private Date employeeLeave;
	private int flag;

}
