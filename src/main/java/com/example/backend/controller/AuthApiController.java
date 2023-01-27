package com.example.backend.controller;

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

	// 중복 체크
	@GetMapping("/check")
	public int checkDupl(@RequestParam("companySeq") String companySeq,
			@RequestParam(required = false, name = "authCode", defaultValue = "") String authCode,
			@RequestParam(required = false, name = "authName", defaultValue = "") String authName, AuthDto dto) {
		dto.setCompanySeq(Integer.parseInt(companySeq));
		if (!authCode.equals(null) && !authCode.equals("")) {
			dto.setAuthCode(authCode);
		}
		if (!authName.equals(null) && !authName.equals("")) {
			dto.setAuthName(authName);
		}
		return authService.checkDupl(dto);
	}
	
	// 추가
	@PostMapping("/add")
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
