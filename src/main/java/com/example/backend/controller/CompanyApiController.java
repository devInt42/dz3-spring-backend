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

import com.example.backend.dto.CompanyDto;
import com.example.backend.service.CompanyServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/company")
public class CompanyApiController {
	
	@Autowired
	private CompanyServiceImpl companyService;

	//선택 사원 조회
	@GetMapping("/{companyCode}")
	public CompanyDto getCompany(@PathVariable(required = true) int companyCode) {
		return companyService.getCompany(companyCode);
	}

	//전체 리스트 조회
	@GetMapping("/companyList")
	public List<CompanyDto> getCompanyList(CompanyDto dto) {
		return companyService.getCompanyList(dto);
	}

	//삭제
	@DeleteMapping("/users/{companyCode}")
	 public void deleteCompany(@PathVariable(required = true) int companyCode) {
		companyService.removeCompany(companyCode);
	}
	
	//추가
	@PostMapping
	public void addCompany(@RequestBody(required=true) Map<String, String>map) {
		companyService.addCompany(map);
	}
	
	//수정
	@PatchMapping("users/{companyCode}")
	public void setCompany(@PathVariable(required=true)String companyCode, @RequestBody(required=true) Map<String,String>map) {
		map.put("companyCode", companyCode);
		companyService.setCompany(map);
	}
}
