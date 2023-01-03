package com.example.backend.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public List<CompanyDto> getallCompany() {
		return companyService.getCompanyInformation();
	}
	
	@GetMapping("/info/{company_code}")
	public CompanyDto getCompany(@PathVariable("company_code") int company_code) {
		
		return companyService.getCompanyInfo(company_code);
	}
	
	@PostMapping("/insert")
	public void insertCompany(@RequestBody CompanyDto dto) {
		System.out.println("dto :: " + dto.toString() );
		System.out.println(111);
		companyService.insertCompany(dto);
	}
	
	@PostMapping("/update/{company_code}")
	public void updateCompany(@PathVariable("company_code") int company_code, @RequestBody CompanyDto dto) {
		dto.setCompany_code(company_code);
		System.out.println("dto :: " + dto.toString());
		companyService.updateCompany(dto);
	}
	
	@GetMapping("/delete/{company_code}")
	public void deleteCompany(@PathVariable("company_code") int company_code) {
		companyService.DeleteCompany(company_code);
	}
}
