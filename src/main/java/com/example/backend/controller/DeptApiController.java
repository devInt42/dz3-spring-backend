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

import com.example.backend.dto.DeptDto;
import com.example.backend.service.DeptServiceImpl;

@RestController
@RequestMapping("/dept")
public class DeptApiController {

	@Autowired
	private DeptServiceImpl DeptService;
	
	@GetMapping("/deptlist")
	public List<DeptDto> getDeptList(){
		return DeptService.getDeptList();
	}
	
	@PostMapping
	public void insertDept(@RequestBody(required=true) Map<String, String> map) {
		DeptService.insertDept(map);
	}
	
	@DeleteMapping("/deptlist/{dept_code}")
	public int deleteDept(@PathVariable(required=true)  int dept_code) {
		return DeptService.deleteDept(dept_code);
	}
	
	@PatchMapping("/deptlist/{dept_code}")
	public int updateDept(@RequestBody(required=true) DeptDto dto) {
		return DeptService.updateDept(dto);
	}
	
	@GetMapping("/deptlist/{dept_code}")
	public List<DeptDto> getSearchDept(@PathVariable(required=true) int dept_code){
		System.out.println(DeptService.getSearchDept(dept_code));
		return DeptService.getSearchDept(dept_code);
	}

}
