package com.example.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	@GetMapping("/emplist/{employeeSeq}")
	public EmployeeDto getEmployee(@PathVariable(required = true) int employeeSeq) {
		return employeeService.getEmployeeBySeq(employeeSeq);
	}
}
