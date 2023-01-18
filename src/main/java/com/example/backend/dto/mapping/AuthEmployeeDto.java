package com.example.backend.dto.mapping;

import lombok.Data;

@Data

public class AuthEmployeeDto {
	private int authSeq;
	private int employeeSeq;
	private int workplaceSeq;
	private int departmentSeq;
	private int companySeq;
	private String authName;
	private String companyName;
	private String authCode;
	
	
	private int departmentCode;
	private String workplaceName;
	private String departmentName;
	private String employeeName;
	private String employeeId;
	private String title;
	
	private int page;
	private int startPgNum;
	private int endPgNum;
}
