package com.example.backend.controller.mapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.dto.mapping.DepartmentEmployeeDto;
import com.example.backend.service.DepartmentEmployeeServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/department-employee")
public class DepartmentEmployeeApiController {

	@Autowired
	private DepartmentEmployeeServiceImpl departementEmployeeService;
	
	@GetMapping("/page/{page}")
	public List<DepartmentEmployeeDto> getList(@PathVariable(required = true) int page,
			@RequestParam("companySeq") String companySeq, @RequestParam("workplaceSeq") String workplaceSeq,
			@RequestParam("departmentSeq") String departmentSeq, DepartmentEmployeeDto dto) {
		dto.setCompanySeq(Integer.parseInt(companySeq));
		dto.setWorkplaceSeq(Integer.parseInt(workplaceSeq));
		dto.setDepartmentSeq(Integer.parseInt(departmentSeq));

		return departementEmployeeService.getEmployeePage(page,dto);
	}

	@GetMapping("/department/page/{page}")
	public List<DepartmentEmployeeDto> getListByDepartment(@PathVariable(required = true) int page,
			@RequestParam("departmentSeq") String departmentSeq, DepartmentEmployeeDto dto) {
		dto.setDepartmentSeq(Integer.parseInt(departmentSeq));
		return departementEmployeeService.getEmployeePagebyDepartment(page,dto);
	}
}
