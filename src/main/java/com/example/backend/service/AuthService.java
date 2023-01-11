package com.example.backend.service;

import java.util.List;
import java.util.Map;

import com.example.backend.dto.AuthDto;

public interface AuthService {
	AuthDto getAuthBySeq(int authSeq);
	List<AuthDto> getAuthList(int page, AuthDto dto);
	void removeAuth(int authSeq);
	void setAuth(Map<String, String> map);
	void addAuth(Map<String, String> map);
}
