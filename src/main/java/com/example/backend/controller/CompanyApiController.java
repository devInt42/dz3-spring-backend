package com.example.backend.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.dto.CompanyDTO;
import com.example.backend.service.companyserviceimpl;

@RestController
@RequestMapping("/api/company")
public class CompanyApiController {
	
	@Autowired
	private companyserviceimpl companyService;
	
	@GetMapping("/info")
	public List<CompanyDTO> getallCompany() {
		System.out.println("getDto:: " + companyService.getCompanyInformation());
		return companyService.getCompanyInformation();
	}
	
	@GetMapping("/info/{companySeq}")
	public CompanyDTO getCompany(@PathVariable("companySeq") int companySeq) {
		
		return companyService.getCompanyInfo(companySeq);
	}
	
	@PostMapping("/insert")
	public void insertCompany(@RequestBody CompanyDTO dto) {
		System.out.println("dto :: " + dto.toString() );
		System.out.println(111);
		companyService.insertCompany(dto);
	}
	
	@PostMapping("/update/{companySeq}")
	public void updateCompany(@PathVariable("companySeq") int companySeq, @RequestBody CompanyDTO dto) {
		 dto.setCompanySeq(companySeq);
		System.out.println("dto :: " + dto.toString());
		companyService.updateCompany(dto);
	}
	
	@GetMapping("/delete/{companySeq}")
	public void deleteCompany(@PathVariable("companySeq") int companySeq) {
		companyService.DeleteCompany(companySeq);
	}
}
