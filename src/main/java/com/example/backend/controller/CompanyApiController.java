package com.example.backend.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.dto.CompanyDto;
import com.example.backend.service.CompanyServiceImpl;

@RestController
@RequestMapping("/company")
public class CompanyApiController {
	
	@Autowired
	private CompanyServiceImpl companyService;
	
	@GetMapping("/info")
	public List<CompanyDto> getallCompany() {
		return companyService.getCompanyInformation();
	}
	
	//중복체크
	@GetMapping("/info/check/{companyCode}")
	public int DupliCheck(@PathVariable("companyCode") int companyCode) {
		
		return companyService.DupliCheck(companyCode);
	}
	
	@GetMapping("/info/{companySeq}")
	public CompanyDto getCompany(@PathVariable("companySeq") int companySeq) {
		return companyService.getCompanyInfo(companySeq);
	}
	
	@PostMapping("/insert")
	public void insertCompany(@RequestBody CompanyDto dto) {
		companyService.insertCompany(dto);
	}
	
	@PostMapping("/update/{companySeq}")
	public void updateCompany(@PathVariable("companySeq") int companySeq, @RequestBody CompanyDto dto) {
		 dto.setCompanySeq(companySeq);
		companyService.updateCompany(dto);
	}
	
	@GetMapping("/delete/{companySeq}")
	public void deleteCompany(@PathVariable("companySeq") int companySeq) {
		companyService.DeleteCompany(companySeq);
	}
	@GetMapping("/find")
	public List<CompanyDto> GetFindList(@RequestParam int companycode, 
			@RequestParam String companyname, @RequestParam String useyn) {
		CompanyDto dto = new CompanyDto(companycode, companyname, useyn);
		return companyService.FindCompany(dto);
	}
}