package com.example.backend.dto;

import lombok.Data;

@Data
public class DepartmentDto {
	private int departmentSeq;
	private int companySeq;
	private int workplaceSeq;
	private int departmentCode;
	private String departmentName;
	private int departmentPresident;
	private String departmentCategory;
	private String departmentCall;
	private String departmentLoc;
	private int departmentParent;
	private String useYN;
	}
