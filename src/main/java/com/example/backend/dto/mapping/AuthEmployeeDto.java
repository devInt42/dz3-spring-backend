package com.example.backend.dto.mapping;

import lombok.Data;

@Data
public class AuthEmployeeDto {
	private int authSeq;
	private int employeeSeq;
	private int workplaceSeq;
	private int departmentSeq;
	private int companySeq;

}
