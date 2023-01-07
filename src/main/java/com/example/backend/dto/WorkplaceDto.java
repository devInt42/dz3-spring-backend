package com.example.backend.dto;


import lombok.Data;

@Data
public class WorkplaceDto {
	private int workplaceSeq;
	private int companySeq;
	private int workplaceCode;
	private String workplaceName;
	private String workplaceAddr;
	private int workplacePresident;
	private String workplaceCall;
	private String workplaceEmail;
}
