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

import com.example.backend.dto.MenuDto;
import com.example.backend.dto.mapping.AuthMenuDto;
import com.example.backend.service.MenuServiceImpl;

@RestController
@RequestMapping("/menu")
public class MenuApiController {

	@Autowired
	private MenuServiceImpl menuService;

	// 깊이별 메뉴 테이블 조회
	@GetMapping("/tree")
	public List<MenuDto> getMenuListByDepth(@RequestParam(required = false, name = "menuParent") String menuParent,
			@RequestParam(required = false, name = "menuDepth") String menuDepth, MenuDto dto) {
		if (!menuParent.equals(null) && !menuParent.equals("")) {
			dto.setMenuParent(Integer.parseInt(menuParent));
		}
		if (!menuDepth.equals(null) && !menuDepth.equals("")) {
			dto.setMenuDepth(Integer.parseInt(menuDepth));
		}
		return menuService.getChildMenuListByDepth(dto);
	}

	// 깊이별 메뉴 테이블 카운트
	@GetMapping("/count")
	public int getCountMenuListByDepth(@RequestParam(required = false, name = "menuParent") String menuParent,
			@RequestParam(required = false, name = "menuDepth") String menuDepth, MenuDto dto) {
		if (!menuParent.equals(null) && !menuParent.equals("")) {
			dto.setMenuParent(Integer.parseInt(menuParent));
		}
		if (!menuDepth.equals(null) && !menuDepth.equals("")) {
			dto.setMenuDepth(Integer.parseInt(menuDepth));
		}
		return menuService.getCountMenuListByDepth(dto);
	}

	// 깊이별 메뉴 테이블 카운트
	@GetMapping("/select")
	public List<MenuDto> getAllList() {
		return menuService.getAllMenuList();
	}

	// 메뉴 리스트 조회
	@GetMapping("/menulist")
	public List<MenuDto> getMenuList() {
		return menuService.getMenuList();
	}

	// 해당 시퀀스의 메뉴 조회
	@GetMapping("/menulist/selectmenu/{menuSequence}")
	public List<MenuDto> getSelectMenu(@PathVariable(required = true) int menuSequence) {
		return menuService.getSelectMenu(menuSequence);
	}

	// 하위 메뉴 조회
	@GetMapping("/menulist/{menuSequence}")
	public List<MenuDto> getSubMenuList(@PathVariable(required = true) int menuSequence) {
		return menuService.getSubMenuList(menuSequence);

	}

	// 상위메뉴 depth 조회
	@GetMapping("/menulist/getdepth/{menuParent}")
	public Integer getParentDepth(@PathVariable(required = true) int menuParent) {
		return menuService.getParentDepth(menuParent);
	}

	// 메뉴 저장
	@PostMapping
	public void insertMenu(@RequestBody(required = true) Map<String, String> map) {
		if(map.get("menuParent").equals("0")) {
			map.put("menuDepth", "0");
		}
		menuService.insertMenu(map);
	}

	// 메뉴 삭제
	@DeleteMapping("/menulist/delete/{menuSeq}")
	public void deleteMenu(@PathVariable(required = true) int menuSeq) {
		menuService.deleteMenu(menuSeq);
	}

	// 메뉴 수정
	@PatchMapping("/menulist/update/{menuSeq}")
	public void updateMenu(@PathVariable(required = true) String menuSeq,
			@RequestBody(required = true) Map<String, String> map) {
		map.put("menuSeq", menuSeq);
		if(map.get("menuParent").equals("0")) {
			map.put("menuDepth", "0");
		}
		menuService.updateMenu(map);
	}

	// 삽입 전 중복조회(메뉴코드)
//	@GetMapping("/menulist/checkcode/{menuCode}")
//	public List<MenuDto> checkCode(@PathVariable(required = true) String menuCode) {
//		return menuService.checkCode(menuCode);
//	}
	@GetMapping("/menulist/checkcode")
	public List<MenuDto> checkCode(@RequestParam("menuCode") String menuCode) {
		return menuService.checkCode(menuCode);
	}

	// 삽입 전 중복조회(메뉴이름)
//	@GetMapping("/menulist/checkname/{menuName}")
//	public List<MenuDto> checkName(@PathVariable(required = true) String menuName) {
//		return menuService.checkName(menuName);
//	}
	@GetMapping("/menulist/checkname")
	public List<MenuDto> checkName(@RequestParam("menuName") String menuName) {
		return menuService.checkName(menuName);
	}

	// 해당 시퀀스의 URL 조회
	@GetMapping("/menulist/geturl/{menuSeq}")
	public String getURL(@PathVariable(required = true) int menuSeq) {
		return menuService.getURL(menuSeq);
	}

	// 하위메뉴 개수 조회
	@GetMapping("/menulist/getcount/{menuSeq}")
	public Integer countMenu(@PathVariable(required = true) int menuSeq) {
		return menuService.countMenu(menuSeq);
	}

	// 메뉴별 하위메뉴 조회
	@GetMapping("/tree/{menuParent}")
	public List<MenuDto> getMenuTree(@PathVariable int menuParent) {
		return menuService.getMenuTree(menuParent);
	}
}
