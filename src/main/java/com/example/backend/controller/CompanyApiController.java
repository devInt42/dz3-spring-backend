package com.example.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.dto.CompanyDto;
import com.example.backend.service.CompanyServiceImpl;

@RestController
@RequestMapping("/company")
public class CompanyApiController {
	@Autowired
	private CompanyServiceImpl companyService;
	
	@GetMapping("/{companyCode}")
	public CompanyDto getCompany(@PathVariable(required=true) int companyCode) {
		return companyService.getCompany(companyCode);
	}

}
