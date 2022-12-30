package com.example.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.dto.EmployeeDto;
import com.example.backend.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/employee")
public class EmployeeApiController {
	@Autowired
	private EmployeeServiceImpl employeeService;
	
	@GetMapping("/emplist")
	public List<EmployeeDto> getEmployeeList(@RequestBody EmployeeDto dto){
		return employeeService.getEmployeeList(dto);
	}
	
	@GetMapping("/{employeeId}")
	public EmployeeDto getEmployee(@PathVariable(required = true) int employeeId) {
		return employeeService.getEmployee(employeeId);
	}

//	@PostMapping("/emplist")
//	public List<EmployeeDto> getEmployeeList(@RequestBody EmployeeDto dto) {
//		System.out.println(dto.toString());
//		return employeeService.getEmployeeList(dto);
//	}

}
