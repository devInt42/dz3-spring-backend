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
import org.springframework.web.bind.annotation.RequestParam;
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

   // 사원조회
   @GetMapping("/emplist")
	public List<EmployeeDto> getEmpList() {
		return employeeService.getEmpList();
	}
   
   // seq에 해당하는 사원조회
   @GetMapping("/emplist/{employeeSeq}")
   public List<EmployeeDto> getEmployee(@PathVariable(required = true) int employeeSeq) {
      return employeeService.getEmployeeBySeq(employeeSeq);
   }
   
   // 사용언어 조회
   @GetMapping("/emplang")
   public List<String> getLanguage(){
	   return employeeService.getLanguage();
   }
   
   // 사원 저장
   @PostMapping
   public void insertEmp(@RequestBody(required = true) Map<String, String> map) {
	   employeeService.insertEmp(map);
   }
   
   // 사원 수정
   @PatchMapping("/emplist/update/{employeeSeq}")
	public void updateEmp(@PathVariable(required = true) String employeeSeq,
			@RequestBody(required = true) Map<String, String> map) {
	   map.put("employeeSeq", employeeSeq);
	   employeeService.updateEmp(map);
   }
   
   // 사원 삭제
   @DeleteMapping("/emplist/delete/{employeeSeq}")
   public void deleteEmp(@PathVariable(required = true) int employeeSeq) {
	   employeeService.deleteEmp(employeeSeq);
   }
   
   // 사원 저장시 로그인ID 중복조회
   @GetMapping("/emplist/checkid")
   public List<EmployeeDto> checkID(@RequestParam("employeeId") String employeeId){
	   System.out.println(employeeService.checkId(employeeId));
	   return employeeService.checkId(employeeId);
   }
   
   // 사원 저장시 메일ID 중복조회
}