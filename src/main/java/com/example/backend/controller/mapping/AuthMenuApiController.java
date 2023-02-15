package com.example.backend.controller.mapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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

	// 권한별 맵핑 메뉴 검색
	@GetMapping("/{authSeq}")
	public List<AuthMenuDto> getAuthMenuList(@PathVariable int authSeq) {
		return authMenuService.getAuthMenuList(authSeq);
	}

	// 권한-메뉴 추가
	@PostMapping("/insert")
	public void addAuthMenu(@RequestBody(required = true) List<Object> list) {
		if (list.size() > 0) {
			authMenuService.addAuthMenu(list);
		}
	}

	// 권한-메뉴 삭제
	@PostMapping("/delete")
	public void removeMenu(@RequestBody(required = true) List<Object> list) {
		if (list.size() > 0) {
		authMenuService.removeAuthMenu(list);
		}
	}

}
