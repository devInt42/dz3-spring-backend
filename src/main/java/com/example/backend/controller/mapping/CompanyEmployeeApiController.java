package com.example.backend.controller.mapping;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.dto.mapping.CompanyEmployeeDto;
import com.example.backend.service.CompanyEmployeeServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/company-employee")
public class CompanyEmployeeApiController {
	@Autowired
	private CompanyEmployeeServiceImpl companyEmployeeService;

	@PostMapping("/check")
	public CompanyEmployeeDto checkEmployee(@RequestBody(required = true) Map<String, String> map) {
		CompanyEmployeeDto dto = new CompanyEmployeeDto();
		dto.setCompanyCode(Integer.parseInt(map.get("companyCode")));
		dto.setEmployeeId(map.get("employeeId"));
		dto.setEmployeePwd(map.get("employeePwd"));

		if (map.get("employeeId").equals(companyEmployeeService.checkLogin(dto).getEmployeeId())
				&& map.get("employeePwd").equals(companyEmployeeService.checkLogin(dto).getEmployeePwd()) && Integer
						.parseInt(map.get("companyCode")) == companyEmployeeService.checkLogin(dto).getCompanyCode()) {
			return companyEmployeeService.checkLogin(dto);
		} else {
			return null;
		}

	}

}
