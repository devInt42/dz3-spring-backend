package com.example.backend.controller.mapping;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.dto.mapping.AuthEmployeeDto;
import com.example.backend.dto.mapping.DepartmentEmployeeDto;
import com.example.backend.service.AuthEmployeeServiceImpl;
import com.example.backend.service.DepartmentEmployeeServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth-employee")
public class AuthEmployeeApiController {

	@Autowired
	private AuthEmployeeServiceImpl authEmployeeService;

	// 회사별 권한 그룹 조회
	@GetMapping("/company/page/{page}")
	public List<AuthEmployeeDto> getAuthListByCompany(@PathVariable(required = true) int page,
			@RequestParam("companySeq") String companySeq, AuthEmployeeDto dto) {
		dto.setCompanySeq(Integer.parseInt(companySeq));
		return authEmployeeService.getAuthCompanyList(page, dto);
	}

	// 권한별 사원 조회
	@GetMapping("/auth/page/{page}")
	public List<AuthEmployeeDto> getAuthListByAuth(@PathVariable(required = true) int page,
			@RequestParam("authSeq") String authSeq, AuthEmployeeDto dto) {
		dto.setAuthSeq(Integer.parseInt(authSeq));
		return authEmployeeService.getAuthEmployeeList(page, dto);
	}
	
	// 그룹수 카운팅
	@GetMapping("/count/{companySeq}")
	public int getAuthCountByCompany(@PathVariable(required = true) String companySeq,
			AuthEmployeeDto dto) {
		dto.setCompanySeq(Integer.parseInt(companySeq));
		return authEmployeeService.getAuthCountByCompany(dto);
	}
}
