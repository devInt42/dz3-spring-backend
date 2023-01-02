package com.example.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.dto.CompanyDto;
import com.example.backend.service.CompanyServiceImpl;


@RestController
@RequestMapping(value= "/api/company")
public class CompanyApiController {
	
	@Autowired
	private CompanyServiceImpl companyService;

//	@GetMapping("/{companyCode}")
//	public CompanyDto getCompany(@PathVariable(required = true) int companyCode) {
//		return companyService.getCompany(companyCode);
//	}

	@GetMapping("/companyList")
	public List<CompanyDto> getCompanyList(CompanyDto dto) {
		return companyService.getCompanyList(dto);
	}

	@DeleteMapping(value = "/users/{companyCode}")
	 public CompanyDto deleteCompany(@PathVariable(required = true) int companyCode) {
		return companyService.deleteById(companyCode);
		
//		if(user==null) {
//			try {
//			} catch (Exception e) {
//				System.out.println("해당 아이디가 없습니다."); 
//			}
//		}
		
	}
}
