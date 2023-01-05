package com.example.backend.dto;

import java.util.Date;

import lombok.Data;

@Data
public class DepartmentDto {
	private int workplaceSeq;
	private int companySeq;
	private int workplaceCode;
	private String workplaceName;
	private String workplaceAddr;
	private int workplacePresident;
	private String workplaceCall;
	private Date workplaceEmail;
}
