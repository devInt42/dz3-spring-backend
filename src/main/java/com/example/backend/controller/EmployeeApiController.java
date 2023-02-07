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
import com.example.backend.dto.MenuDto;
import com.example.backend.service.EmployeeServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeApiController {
   @Autowired
   private EmployeeServiceImpl employeeService;

   @GetMapping("/emplist")
	public List<EmployeeDto> getEmpList() {
		return employeeService.getEmpList();
	}
   
   @GetMapping("/emplist/{employeeSeq}")
   public List<EmployeeDto> getEmployee(@PathVariable(required = true) int employeeSeq) {
      return employeeService.getEmployeeBySeq(employeeSeq);
   }
   
   @GetMapping("/emplang")
   public List<String> getLanguage(){
	   return employeeService.getLanguage();
   }
   
   @PostMapping
   public void insertEmp(@RequestBody(required = true) Map<String, String> map) {
	   employeeService.insertEmp(map);
   }
   
   @PatchMapping("/emplist/update/{employeeSeq}")
	public void updateEmp(@PathVariable(required = true) String employeeSeq,
			@RequestBody(required = true) Map<String, String> map) {
	   map.put("employeeSeq", employeeSeq);
	   employeeService.updateEmp(map);
   }
   
   @DeleteMapping("/emplist/delete/{employeeSeq}")
   public void deleteEmp(@PathVariable(required = true) int employeeSeq) {
	   employeeService.deleteEmp(employeeSeq);
   }
}