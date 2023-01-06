package com.example.backend.dto;

import java.util.Date;

import lombok.Data;

@Data
public class EmployeeDto {
	private int employeeCode;
	private int employeeDept;
	private String employeeId;
	private String employeeName;
	private Date employeeBirth;
	private String employeeCall;
	private String employeePwd;
	private String employeePh;
	private String employeePmail;
	private String employeeCmail;
	private String employeeAddr;
	private String employeePosition;
}