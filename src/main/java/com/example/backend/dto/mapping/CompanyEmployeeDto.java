package com.example.backend.dto.mapping;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CompanyEmployeeDto {
	private int employeeSeq;
	private int workplaceSeq;
	private int departmentSeq;
	private int companySeq;
	
	
	private String employeeId;
	private String employeePwd;
	private String employeeName;
	private String employeeBirth;
	private String companyName;

	private String companyCode;
	private String employeeCode;
	
	private Date employeeJoin;
	private Date employeeLeave;
	
	private String employeeClassification;
}
