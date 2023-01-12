package com.example.backend.service;

import java.util.List;
import java.util.Map;

import com.example.backend.dto.mapping.AuthMenuDto;


public interface AuthMenuService {
	AuthMenuDto getAuthMenuBySeq(Map<String, String> map);
	List<AuthMenuDto> getAuthMenuList(AuthMenuDto dto);
	void removeAuthMenu(Map<String, String> map);
	void setAuthMenu(Map<String, String> map);
	void addAuthMenu(Map<String, String> map);
}
