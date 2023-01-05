package com.example.backend.dto.mapping;

import lombok.Data;

@Data
public class DepartmentEmployeeDto {
	private int employeeSeq;
	private int workplaceSeq;
	private int departmentSeq;
	private int companySeq;
	private int subDepartmentSeq;
	private String title;
}
