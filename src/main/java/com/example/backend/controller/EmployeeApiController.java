package com.example.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
	
//	@GetMapping("/emplist")
//	public List<EmployeeDto> getEmployeeList(EmployeeDto dto){
//		return employeeService.getEmployeeList(dto);
//	}
	
	@GetMapping("/{employeeId}")
	public EmployeeDto getEmployee(@PathVariable(required = true) int employeeId) {
		return employeeService.getEmployee(employeeId);
	}

	@PostMapping("/list")
	public List<EmployeeDto> getEmployeeList(EmployeeDto dto) {
		System.out.println(dto.toString());
		return employeeService.getEmployeeList(dto);
	}

}
