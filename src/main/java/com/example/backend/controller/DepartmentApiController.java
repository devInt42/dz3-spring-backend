package com.example.backend.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.dto.DepartmentDto;
import com.example.backend.service.DepartmentServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/department")
public class DepartmentApiController {
	@Autowired
	private DepartmentServiceImpl departmentService;

	@GetMapping("/list")
	 public List<DepartmentDto> getDepartmentList(@RequestParam("departmentDepth") String departmentDepth,
	         @RequestParam("departmentParent") String departmentParent, DepartmentDto dto) {
		System.out.println("Depth: " +departmentDepth);
		System.out.println("Parent: " +departmentParent);
		dto.setDepartmentDepth(Integer.parseInt(departmentDepth));
		dto.setDepartmentParent(Integer.parseInt(departmentParent));
		System.out.println(dto);
		return departmentService.GetDepartmentList(dto);
	 }
	@GetMapping("/count")
	 public int getDepartmentCount(@RequestParam("departmentDepth") String departmentDepth,
	         @RequestParam("departmentParent") String departmentParent, DepartmentDto dto) {
		dto.setDepartmentDepth(Integer.parseInt(departmentDepth));
		dto.setDepartmentParent(Integer.parseInt(departmentParent));
		if (departmentService.GetDepartmentCount(dto) == null) {return 0;}
		return departmentService.GetDepartmentCount(dto);
	 }

	@GetMapping("/list/company")
	public List<DepartmentDto> getCompanyList() {
		return departmentService.GetCompanyList();
	}

	@GetMapping("/list/workplace")
	public List<DepartmentDto> getWorkplaceList() {
		return departmentService.GetWorkplaceList();
	}
	@GetMapping("/list/{departmentSeq}")
	public List<DepartmentDto> getDepartment(@PathVariable("departmentSeq") int departmentSeq) {
		return departmentService.GetDepartment(departmentSeq);
	}
	@GetMapping("/list/name")
	public List<DepartmentDto> getCompanyWorkplaceName(@RequestParam("companySeq") int companySeq,
			@RequestParam("workplaceSeq") int workplaceSeq, DepartmentDto dto) {
		dto.setCompanySeq(companySeq);
		dto.setWorkplaceSeq(workplaceSeq);
		return departmentService.GetCompanyWorkplaceName(dto);
	}
	@GetMapping("/workplace/{workplaceSeq}")
	public List<DepartmentDto> GetWorkplaceData(@PathVariable("workplaceSeq") int workplaceSeq) {
		return departmentService.GetWorkplaceData(workplaceSeq);
	}
}
