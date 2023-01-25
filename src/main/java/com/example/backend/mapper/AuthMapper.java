package com.example.backend.mapper;

import java.util.List;
import java.util.Map;

import com.example.backend.dto.AuthDto;

public interface AuthMapper {
	List<AuthDto> getList(AuthDto dto);
	AuthDto getBySeq(int authSeq);
	void remove(int authSeq);
	void add(Map<String, String> map);
	void set(Map<String, String> map);
}
