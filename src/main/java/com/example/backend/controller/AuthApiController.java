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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.dto.AuthDto;
import com.example.backend.service.AuthServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthApiController {

	@Autowired
	private AuthServiceImpl authService;

	// 회사 시퀀스로 사원 조회
	@GetMapping("/page/{page}")
	public List<AuthDto> getList(@PathVariable (required = true) int page,
			@RequestParam("companySeq") String companySeq, 
			AuthDto dto)	{
		
		return authService.getAuthList(page,dto);
	}
	
	// 사원 추가

	@PostMapping
	public void addAuth(@RequestBody(required = true) Map<String, String> map) {
		authService.addAuth(map);
	}

	// 삭제

	@DeleteMapping("/authlist/{authSeq}")
	public void removeAuth(@PathVariable(required = true) int authSeq) {
		authService.removeAuth(authSeq);
	}

	// 수정

	@PatchMapping("/authlist/{authSeq}")
	public void setAuth(@PathVariable(required = true) String authSeq,
			@RequestBody(required = true) Map<String, String> map) {
		map.put("authSeq", authSeq);
		System.out.println(map);
		authService.setAuth(map);
	}

}
