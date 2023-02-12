package com.example.backend.controller.mapping;

import java.util.List;

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
	@GetMapping("/employeeList")
	public List<DepartmentEmployeeDto> getList(
			@RequestParam(required = false, name = "companySeq", defaultValue = "") String companySeq,
			@RequestParam("workplaceSeq") String workplaceSeq, @RequestParam("departmentSeq") String departmentSeq,
			@RequestParam(required = false, name = "employeeName", defaultValue = "") String employeeName,
			DepartmentEmployeeDto dto, HttpServletRequest request) throws JSONException {
		JSONObject jObject = new JSONObject(request.getHeader("Authorization"));

		dto.setWorkplaceSeq(Integer.parseInt(workplaceSeq));
		dto.setDepartmentSeq(Integer.parseInt(departmentSeq));

		if (!companySeq.equals(null) && !companySeq.equals("")) {
			dto.setCompanySeq(Integer.parseInt(companySeq));

		} else {
			if ((int) jObject.get("employeeSeq") != 999) { // admin 계정이 아닌 경우
				dto.setCompanySeq((int) jObject.get("companySeq"));
			}
		}

		if (!employeeName.equals(null) && !employeeName.equals("")) { // 회사 seq가 없을 경우 헤더로 보낸 토큰값의 회사번호를 dto에 set함.
			dto.setEmployeeName(employeeName);
		}
		return departmentEmployeeService.getEmployeePage(dto);
	}

	// 로그인한 유저 정보
	@GetMapping("/info")
	public List<DepartmentEmployeeDto> userInfo(DepartmentEmployeeDto dto, HttpServletRequest request)
			throws JSONException {
		JSONObject jObject = new JSONObject(request.getHeader("Authorization"));
		dto.setEmployeeSeq((int) jObject.get("employeeSeq"));
		return departmentEmployeeService.getEmployeeInfo(dto);
	}

	// 부서seq로 해당 부서 직원수 Count
	@GetMapping("/count/{departmentSeq}")
	public int getEmployeeCountByDepartment(@PathVariable(required = true) String departmentSeq,
			DepartmentEmployeeDto dto) {
		dto.setDepartmentSeq(Integer.parseInt(departmentSeq));
		return departmentEmployeeService.getEmployeeCountByDepartment(dto);
	}

	// 회사 seq를 받아와서 회사를 select
	@GetMapping("/companyElement")
	public List<DepartmentEmployeeDto> getCompanyElement(
			@RequestParam(required = false, name = "companySeq", defaultValue = "") String companySeq,
			DepartmentEmployeeDto dto, HttpServletRequest request) throws JSONException {
		JSONObject jObject = new JSONObject(request.getHeader("Authorization"));

		if (!companySeq.equals(null) && !companySeq.equals("")) {
			dto.setCompanySeq(Integer.parseInt(companySeq));
			return departmentEmployeeService.getCompanyElement(dto);

		} else { // 회사 seq가 없을 경우 헤더로 보낸 토큰값의 회사번호를 dto에 set함.
			if ((int) jObject.get("employeeSeq") == 999) {
				return departmentEmployeeService.getAllCompany(dto);

			} else {// admin 계정이 아닌 경우
				dto.setCompanySeq((int) jObject.get("companySeq"));
				dto.setEmployeeSeq((int) jObject.get("employeeSeq"));
				return departmentEmployeeService.getCompanyElement(dto);

			}
		}

	}

	// 회사 seq를 받아와서 중복제거된 사업장을 select
	@GetMapping("/workplaceList")
	public List<DepartmentEmployeeDto> getWorkplaceList(
			@RequestParam(required = false, name = "companySeq", defaultValue = "") String companySeq,
			DepartmentEmployeeDto dto, HttpServletRequest request) throws JSONException {
		JSONObject jObject = new JSONObject(request.getHeader("Authorization"));

		if (!companySeq.equals(null) && !companySeq.equals("")) { // 회사 seq가 없을 경우 헤더로 보낸 토큰값의 회사번호를 dto에 set함.
			dto.setCompanySeq(Integer.parseInt(companySeq));
		} else {
			if ((int) jObject.get("employeeSeq") != 999) { // admin 계정이 아닌 경우
				dto.setCompanySeq((int) jObject.get("companySeq"));
			}
		}

		return departmentEmployeeService.getWorkplaceInfo(dto);

	}

	// 회사 seq를 받아와서 중복제거된 부서를 select
	@GetMapping("/departmentList")
	public List<DepartmentEmployeeDto> getDepartmentList(
			@RequestParam(required = false, name = "companySeq", defaultValue = "") String companySeq,
			DepartmentEmployeeDto dto, HttpServletRequest request) throws JSONException {
		JSONObject jObject = new JSONObject(request.getHeader("Authorization"));

		if (!companySeq.equals(null) && !companySeq.equals("")) { // 회사 seq가 없을 경우 헤더로 보낸 토큰값의 회사번호를 dto에 set함.
			dto.setCompanySeq(Integer.parseInt(companySeq));

		} else {
			if ((int) jObject.get("employeeSeq") != 999) { // admin 계정이 아닌 경우
				dto.setCompanySeq((int) jObject.get("companySeq"));
			}
		}
		return departmentEmployeeService.getDepartmentInfo(dto);
	}

	// 회사 seq를 통해 search값에 해당되는 직원만 select
	@GetMapping("/search")
	public List<DepartmentEmployeeDto> getSearchElement(
			@RequestParam(required = false, name = "employeeName", defaultValue = "") String employeeName,
			@RequestParam(required = false, name = "companySeq", defaultValue = "") String companySeq,

			DepartmentEmployeeDto dto, HttpServletRequest request) throws JSONException {
		JSONObject jObject = new JSONObject(request.getHeader("Authorization"));
		dto.setEmployeeName(employeeName);

		if (!companySeq.equals(null) && !companySeq.equals("")) { // 회사 seq가 없을 경우 헤더로 보낸 토큰값의 회사번호를 dto에 set함.
			dto.setCompanySeq(Integer.parseInt(companySeq));
		} else {
			dto.setCompanySeq((int) jObject.get("companySeq"));
			dto.setEmployeeSeq((int) jObject.get("employeeSeq"));
		}
		return departmentEmployeeService.getEmployeePage(dto);
	}

	// 회사 seq를 통해 search값에 해당되는 직원만 select
	@GetMapping("/detail")
	public DepartmentEmployeeDto getSelectEmployeeInfo(
			@RequestParam(required = false, name = "employeeSeq", defaultValue = "") String employeeSeq,
			@RequestParam(required = false, name = "companySeq", defaultValue = "") String companySeq,
			DepartmentEmployeeDto dto) throws JSONException {

		dto.setCompanySeq(Integer.parseInt(companySeq));
		dto.setEmployeeSeq(Integer.parseInt(employeeSeq));
		return departmentEmployeeService.getSelectEmployeeInfo(dto);
	}

	// 회사 seq, 직원 seq를 통해 select
	@GetMapping("/myInfo")
	public List<DepartmentEmployeeDto> getMyInfo(DepartmentEmployeeDto dto, HttpServletRequest request)
			throws JSONException {
		JSONObject jObject = new JSONObject(request.getHeader("Authorization"));

		dto.setCompanySeq((int) jObject.get("companySeq"));
		dto.setEmployeeSeq((int) jObject.getInt("employeeSeq"));
		return departmentEmployeeService.getmyInfo(dto);
	}

	// 회사 seq를 받아와서 중복제거된 부서를 select
	@GetMapping("/auth")
	public List<DepartmentEmployeeDto> getDepartmentListByAuth(@RequestParam("companySeq") String companySeq,
			@RequestParam("authSeq") String authSeq, DepartmentEmployeeDto dto) {
		dto.setAuthSeq(Integer.parseInt(authSeq));
		dto.setCompanySeq(Integer.parseInt(companySeq));
		return departmentEmployeeService.getAuthInfo(dto);
	}

	// 회사 seq를 받아와서 중복제거된 dept name select
	@GetMapping("/departmentGroup")
	public List<DepartmentEmployeeDto> getDepartmentGroup(
			@RequestParam(required = false, name = "companySeq") String companySeq,
			@RequestParam(required = false, name = "departmentParent") String departmentParent,
			@RequestParam(required = false, name = "departmentDepth") String departmentDepth,
			@RequestParam(required = false, name = "workplaceSeq") String workplaceSeq, DepartmentEmployeeDto dto) {

		if (!companySeq.equals(null) && !companySeq.equals("")) {
			dto.setCompanySeq(Integer.parseInt(companySeq));
		}
		if (!workplaceSeq.equals(null) && !workplaceSeq.equals("")) {
			dto.setWorkplaceSeq(Integer.parseInt(workplaceSeq));
		}
		if (!departmentParent.equals(null) && !departmentParent.equals("")) {
			dto.setDepartmentParent(Integer.parseInt(departmentParent));
		}
		if (!departmentDepth.equals(null) && !departmentDepth.equals("")) {
			dto.setDepartmentDepth(Integer.parseInt(departmentDepth));
		}

		return departmentEmployeeService.getDepartmentGroup(dto);
	}

	// 해당 부서 count
	@GetMapping("/count")
	public int getCount(@RequestParam("companySeq") String companySeq,
			@RequestParam("departmentParent") String departmentParent,
			@RequestParam("departmentDepth") String departmentDepth, @RequestParam("workplaceSeq") String workplaceSeq,
			DepartmentEmployeeDto dto) {
		if (!companySeq.equals(null) && !companySeq.equals("")) {
			dto.setCompanySeq(Integer.parseInt(companySeq));
		}
		if (!workplaceSeq.equals(null) && !workplaceSeq.equals("")) {
			dto.setWorkplaceSeq(Integer.parseInt(workplaceSeq));
		}
		if (!departmentParent.equals(null) && !departmentParent.equals("")) {
			dto.setDepartmentParent(Integer.parseInt(departmentParent));
		}
		if (!departmentDepth.equals(null) && !departmentDepth.equals("")) {
			dto.setDepartmentDepth(Integer.parseInt(departmentDepth));
		}

		return departmentEmployeeService.getDepartmentCount(dto);
	}

	// 부서seq로 해당 부서 직원 select
	@GetMapping("/department")
	public List<DepartmentEmployeeDto> getListByDepartment(@RequestParam("departmentSeq") String departmentSeq,
			DepartmentEmployeeDto dto) {
		dto.setDepartmentSeq(Integer.parseInt(departmentSeq));
		return departmentEmployeeService.getEmployeePagebyDepartment(dto);
	}

	// 사원이 속한 부서 트리구조 역으로 검색
	@GetMapping("/emp-dept")
	public List<DepartmentEmployeeDto> getEmployeeDepartmentTree(
			@RequestParam(required = false, name = "departmentSeq", defaultValue = "") String departmentSeq,
			@RequestParam(required = false, name = "companySeq", defaultValue = "") String companySeq,
			DepartmentEmployeeDto dto, HttpServletRequest request) throws JSONException {
		JSONObject jObject = new JSONObject(request.getHeader("Authorization"));

		// 부서값, 회사값이 넘어오지 않을경우 로그인한 정보로 dto설정
		if (!departmentSeq.equals(null) && !departmentSeq.equals("0")) {
			dto.setDepartmentSeq(Integer.parseInt(departmentSeq));
		} else {
			dto.setDepartmentSeq((int) jObject.get("departmentSeq"));
			dto.setEmployeeSeq((int) jObject.get("employeeSeq"));

		}
		if (!companySeq.equals(null) && !companySeq.equals("0")) {
			dto.setCompanySeq(Integer.parseInt(companySeq));
		} else {
			dto.setCompanySeq((int) jObject.get("companySeq"));
		}
		return departmentEmployeeService.getEmployeeDepartmentTree(dto);
	}

	@GetMapping("/tree")
	public List<DepartmentEmployeeDto> getDepartmentList(@RequestParam("departmentSeq") String departmentSeq,
			DepartmentEmployeeDto dto) {
		return departmentEmployeeService.getDeptTree(dto);
	}

	// 해당 직원의 회사, 사업장, 부서 이름 select
	@GetMapping("/belong")
	public List<DepartmentEmployeeDto> getBelongNames(@RequestParam("employeeSeq") int employeeSeq,
			DepartmentEmployeeDto dto) {
		dto.setEmployeeSeq(employeeSeq);
		return departmentEmployeeService.getBelongNames(dto);
	}

	// 부서 리스트 뽑기
	@GetMapping("/select/list/{companySeq}")
	public List<DepartmentEmployeeDto> getDepartmentSelectList(@PathVariable("companySeq") int companySeq) {
		return departmentEmployeeService.getDepartmentSelectList(companySeq);
	}

	// 회사 seq로 해당 사원 조회
	@GetMapping("/companyemp")
	public List<DepartmentEmployeeDto> getCompanyEmp(@RequestParam("selectCompany") String companySeq,
			DepartmentEmployeeDto dto) {
		dto.setCompanySeq(Integer.parseInt(companySeq));
		System.out.println(departmentEmployeeService.getCompanyEmp(dto));
		return departmentEmployeeService.getCompanyEmp(dto);
	}

	// 직급 조회
	@GetMapping("/position")
	public List<DepartmentEmployeeDto> getPosition() {
		return departmentEmployeeService.getPosition();
	}

	// 직책 조회
	@GetMapping("/duty")
	public List<DepartmentEmployeeDto> getDuty() {
		return departmentEmployeeService.getDuty();
	}

	// 직원 조직정보 수정
	@PostMapping("/update")
	public void updateGroupInfo(@RequestBody DepartmentEmployeeDto dto) {
		departmentEmployeeService.updateGroupInfo(dto);
	}
}
