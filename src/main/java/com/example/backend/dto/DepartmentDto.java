package com.example.backend.dto;

import lombok.Data;

@Data
public class DepartmentDto {
	private int departmentSeq;
	private int companySeq;
	private int workplaceSeq;
	private String companyName;
	private String workplaceName;
	private int companyCode;
	private int workplaceCode;
	private int departmentCode;
	private String departmentName;
	private String departmentLoc;
	private int departmentParent;
	private String useYN;
	private int departmentDepth;
	private String departmentCall;
	private String departmentFax;
	private String departmentZipCode;
}
