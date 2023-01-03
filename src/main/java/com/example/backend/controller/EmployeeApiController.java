package com.example.backend.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.dto.EmployeeDto;
import com.example.backend.service.EmployeeServiceImpl;

import lombok.RequiredArgsConstructor;
@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeApiController {
	@Autowired
	private EmployeeServiceImpl employeeService;
	
	// 전체 사원 조회
	@GetMapping("/emplist")
	public List<EmployeeDto> getEmployeeList(EmployeeDto dto){
		return employeeService.getEmployeeList(dto);
	}
	
	// 사번으로 사원 조회
	@GetMapping("/emplist/{employeeId}")
	public EmployeeDto getEmployee(@PathVariable(required = true) int employeeCode) {
		return employeeService.getEmployeeByCode(employeeCode);
	}
	
	// 사원 추가
	@PostMapping
	public void addEmployee(@RequestBody(required=true) Map<String, String> map) {
		employeeService.addEmployee(map);
	}
	
	// 삭제
	@DeleteMapping("/emplist/{employeeId}")
	public void removeEmployee(@PathVariable(required=true)  int employeeCode) {
		employeeService.removeEmployee(employeeCode);
	}

	// 수정
	@PatchMapping("/emplist/{employeeId}")
	public void setEmployee(@PathVariable(required=true) String employeeId, @RequestBody(required=true) Map<String, String> map) {
		map.put("employeeId", employeeId);
		System.out.println(map);
		employeeService.setEmployee(map);
	}
	
}
