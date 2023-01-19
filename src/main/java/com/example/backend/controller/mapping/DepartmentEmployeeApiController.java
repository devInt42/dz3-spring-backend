package com.example.backend.controller.mapping;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
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
	private DepartmentEmployeeServiceImpl departmentEmployeeService;

	// 회사seq, 사업장seq, 부서seq 를 통해 직원 리스트 select
	@GetMapping("employeeList")
	public List<DepartmentEmployeeDto> getList(@RequestParam("companySeq") String companySeq,
			@RequestParam("workplaceSeq") String workplaceSeq, @RequestParam("departmentSeq") String departmentSeq,
			DepartmentEmployeeDto dto) {
		dto.setCompanySeq(Integer.parseInt(companySeq));
		dto.setWorkplaceSeq(Integer.parseInt(workplaceSeq));
		dto.setDepartmentSeq(Integer.parseInt(departmentSeq));
		return departmentEmployeeService.getEmployeePage(dto);
	}

	// 로그인한 유저 정보
		@GetMapping("/info")
		public DepartmentEmployeeDto userInfo(DepartmentEmployeeDto dto, HttpServletRequest request)	throws JSONException {
			JSONObject jObject = new JSONObject(request.getHeader("Authorization"));
			if ((int) jObject.get("employeeSeq") != 0) {// admin 계정이 아닐경우
				dto.setCompanySeq((int) jObject.get("companySeq"));
				dto.setEmployeeSeq((int) jObject.get("employeeSeq"));
			}
			return departmentEmployeeService.getEmployeeInfo(dto);
		}
		
	
	// 부서seq로 해당 부서 직원 select
	@GetMapping("/department")
	public List<DepartmentEmployeeDto> getListByDepartment(@RequestParam("departmentSeq") String departmentSeq,
			DepartmentEmployeeDto dto) {
		dto.setDepartmentSeq(Integer.parseInt(departmentSeq));
		return departmentEmployeeService.getEmployeePagebyDepartment(dto);
	}

	// 부서seq로 해당 부서 직원수 Count
	@GetMapping("/count/{departmentSeq}")
	public int getEmployeeCountByDepartment(@PathVariable(required = true) String departmentSeq,
			DepartmentEmployeeDto dto) {
		dto.setDepartmentSeq(Integer.parseInt(departmentSeq));
		return departmentEmployeeService.getEmployeeCountByDepartment(dto);
	}
}
