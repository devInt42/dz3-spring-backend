package com.example.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.dto.CompanyDto;
import com.example.backend.service.CompanyServiceImpl;

@RestController
@RequestMapping("/api/company")
public class CompanyApiController {
	
	@Autowired
	private CompanyServiceImpl companyService;
	
	@GetMapping("/info")
	public List<CompanyDto> getCompany() {
		System.out.println(companyService.getCompanyInformation());
		return companyService.getCompanyInformation();
	}
}
