package com.example.backend.controller.mapping;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
		dto.setCompanyCode(map.get("companyCode"));
		dto.setEmployeeId(map.get("employeeId"));
		dto.setEmployeePwd(map.get("employeePwd"));

		if (map.get("employeeId").equals(companyEmployeeService.checkLogin(dto).getEmployeeId())
				&& map.get("employeePwd").equals(companyEmployeeService.checkLogin(dto).getEmployeePwd())
				&& map.get("companyCode").equals(companyEmployeeService.checkLogin(dto).getCompanyCode())) {
			return companyEmployeeService.responseLogin(dto);
		} else {
			return null;
		}
	}

	// 사원 소속 회사명 조회
	@GetMapping("/select")
	public List<CompanyEmployeeDto> getCompanyListByEmployee(CompanyEmployeeDto dto, HttpServletRequest request)
			throws JSONException {

		JSONObject jObject = new JSONObject(request.getHeader("Authorization"));
		dto.setEmployeeSeq((int) jObject.getInt("employeeSeq"));

		// 헤더로 보낸 토큰값의 회사번호를 dto에 set
		if ((int) jObject.get("employeeSeq") != 999) {// admin 계정이 아닐경우
			dto.setCompanySeq((int) jObject.get("companySeq"));
			return companyEmployeeService.getCompanyList(dto);

		} else {
			return companyEmployeeService.getAllCompanyList(dto);
		}
	}

	// 사원 소속 회사명 조회
	@GetMapping("/emplist")
	public List<CompanyEmployeeDto> getCompanyEmployeeList(
			@RequestParam(required = false, name = "companySeq", defaultValue = "") String companySeq,
			@RequestParam(required = false, name = "employeeName", defaultValue = "") String employeeName,
			@RequestParam(required = false, name = "employeeClassification", defaultValue = "") String employeeClassification,
			CompanyEmployeeDto dto, HttpServletRequest request) throws JSONException {
		JSONObject jObject = new JSONObject(request.getHeader("Authorization"));
		dto.setEmployeeSeq((int) jObject.getInt("employeeSeq"));

		if ((int) jObject.getInt("employeeSeq") == 999) {
			// 마스터계정이 회사를 선택해서 본경우
			if (!companySeq.equals(null) && !companySeq.equals("") && !companySeq.equals("0")) {
				dto.setCompanySeq(Integer.parseInt(companySeq));
			}
		} else {
			dto.setCompanySeq((int) jObject.getInt("companySeq"));
		}

		// 헤더로 보낸 토큰값의 회사번호를 dto에 set
		if (!employeeName.equals(null) && !employeeName.equals("")) {
			dto.setEmployeeName(employeeName);
		}
		// 헤더로 보낸 토큰값의 회사번호를 dto에 set
		if (!employeeClassification.equals(null) && !employeeClassification.equals("")
				&& !employeeClassification.equals("0")) {
			dto.setEmployeeClassification(employeeClassification);
		}
		return companyEmployeeService.getEmployeeList(dto);
	}

	// 사원 코드 중복체크
	@GetMapping("/duplicheck")
	public int codeDupliCheck(@RequestParam("companySeq") int companySeq,
			@RequestParam("employeeCode") String employeeCode, CompanyEmployeeDto dto) {

		dto.setCompanySeq(companySeq);
		dto.setEmployeeCode(employeeCode);
		return companyEmployeeService.codeDupliCheck(dto);
	}

}
