package com.example.backend.controller.mapping;

import java.util.HashMap;
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

import com.example.backend.dto.mapping.AuthMenuDto;
import com.example.backend.service.AuthMenuServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth-menu")
public class AuthMenuApiController {
	@Autowired
	private AuthMenuServiceImpl authMenuService;

	@GetMapping("/list/{authSeq}/{menuSeq}")
	public List<AuthMenuDto> getAuthMenuList(@PathVariable(required = false) int authSeq,
			@PathVariable(required = false) int menuSeq, AuthMenuDto dto) {
		System.out.println(authSeq);
		System.out.println(menuSeq);
		System.out.println(dto);

		if (authSeq != 0) {
			dto.setAuthSeq(authSeq);
		}
		if (menuSeq != 0) {
			dto.setMenuSeq(menuSeq);
		}
		return authMenuService.getAuthMenuList(dto);
	}

	@PostMapping("/list/add")
	public void addAuthMenu(@RequestBody(required = true) Map<String, String> map) {
		authMenuService.addAuthMenu(map);
	}

	@DeleteMapping("/list")
	public void removeMenu(@RequestBody(required = true) Map<String, String> map) {
		authMenuService.removeAuthMenu(map);
	}

	@PatchMapping("/list")
	public void setMenu(@RequestBody(required = true) Map<String, String> map) {
		authMenuService.setAuthMenu(map);
	}
}
