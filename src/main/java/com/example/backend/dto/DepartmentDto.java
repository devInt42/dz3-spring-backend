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
<<<<<<< HEAD
	}
=======
	private int departmentDepth;
}
>>>>>>> 2b54baac469c256f4e4ea16f4548406690a41883
