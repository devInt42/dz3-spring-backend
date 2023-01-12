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

import com.example.backend.dto.MenuDto;
import com.example.backend.service.MenuServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/menu")
public class MenuApiController {
	@Autowired
	private MenuServiceImpl menuService;

	// 전체 사원 조회

	@GetMapping("/menulist")
	public List<MenuDto> getEmployeeList(MenuDto dto) {
		return menuService.getMenuList(dto);
	}

	// 사번으로 사원 조회

	@GetMapping("/menulist/{menuSeq}")
	public MenuDto getEmployee(@PathVariable(required = true) int menuSeq) {
		return menuService.getMenuBySeq(menuSeq);
	}

	// 사원 추가

	@PostMapping
	public void addMenu(@RequestBody(required = true) Map<String, String> map) {
		menuService.addMenu(map);
	}

	// 삭제

	@DeleteMapping("/menulist/{menuSeq}")
	public void removeMenu(@PathVariable(required = true) int menuSeq) {
		menuService.removeMenu(menuSeq);
	}

	// 수정

	@PatchMapping("/menulist/{menuSeq}")
	public void setMenu(@PathVariable(required = true) String menuSeq,
			@RequestBody(required = true) Map<String, String> map) {
		map.put("menuSeq", menuSeq);
		System.out.println(map);
		menuService.setMenu(map);
	}

}
