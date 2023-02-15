package com.example.backend.service;

import java.util.List;

import com.example.backend.dto.mapping.AuthMenuDto;

public interface AuthMenuService {
	List<AuthMenuDto> getAuthMenuList(int authSeq);

	void addAuthMenu(List<Object> list);

	void removeAuthMenu(List<Object> list);
}
