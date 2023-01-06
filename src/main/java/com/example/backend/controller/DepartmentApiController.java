package com.example.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
	 @GetMapping("/list/{companySeq}")
	   public List<DepartmentDto> getDepartmentList(@PathVariable(required = true)int companySeq, DepartmentDto dto){
	     dto.setCompanySeq(companySeq);
		 return departmentService.getDepartmentList(dto);
	   }
}
