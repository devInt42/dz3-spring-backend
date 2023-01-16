package com.example.backend.controller.mapping;

import java.util.Enumeration;
import java.util.List;
import java.util.Map;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.dto.mapping.AuthEmployeeDto;
import com.example.backend.service.AuthEmployeeServiceImpl;

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
			@RequestParam(required = false, name = "companySeq", defaultValue = "") String companySeq,
			@RequestParam(required = false, name = "workplaceSeq") String workplaceSeq,
			@RequestParam(required = false, name = "departmentSeq") String departmentSeq,
			@RequestParam(required = false, name = "authName", defaultValue = "") String authName,
			AuthEmployeeDto dto,HttpServletRequest request) throws JSONException {

		String empInfo= request.getHeader("Authorization");
		JSONObject jObject = new JSONObject(request.getHeader("Authorization"));
		System.out.println("집중");
		System.out.println(jObject.get("companySeq"));
		System.out.println(jObject.get("employeeSeq"));
		System.out.println("=================");
		if (!companySeq.equals(null) && !companySeq.equals("")) {
			dto.setCompanySeq(Integer.parseInt(companySeq));
		}

		if (!authName.equals(null) && !authName.equals("")) {
			dto.setAuthName(authName);
		}
		System.out.println(dto);

		return authEmployeeService.getAuthCompanyList(page, dto);
	}

	// 권한별 사원 조회
	@GetMapping("/auth/page/{page}")
	public List<AuthEmployeeDto> getAuthListByAuth(@PathVariable(required = true) int page,
			@RequestParam("authSeq") String authSeq,
			@RequestParam(required = false, name = "companySeq", defaultValue = "") String companySeq,
			AuthEmployeeDto dto) {
		dto.setAuthSeq(Integer.parseInt(authSeq));
		if (!companySeq.equals(null) && !companySeq.equals("")) {
			dto.setCompanySeq(Integer.parseInt(companySeq));
		}
		return authEmployeeService.getAuthEmployeeList(page, dto);
	}

	// 그룹수 카운팅
	@GetMapping("/count")
	public int getAuthCountByCompany(
			@RequestParam(required = false, name = "companySeq", defaultValue = "") String companySeq,
			@RequestParam(required = false, name = "authName", defaultValue = "") String authName,
			AuthEmployeeDto dto) {
		if (!companySeq.equals(null) && !companySeq.equals("")) {
			dto.setCompanySeq(Integer.parseInt(companySeq));
		}
		if (!authName.equals(null) && !authName.equals("")) {
			dto.setAuthName(authName);
		}
		return authEmployeeService.getAuthCountByCompany(dto);
	}
}
