package com.example.backend.mapper;

import java.util.List;
import java.util.Map;

import com.example.backend.dto.AuthDto;
import com.example.backend.dto.mapping.AuthEmployeeDto;

public interface AuthMapper {
	List<AuthDto> getList(AuthDto dto);
	AuthDto getBySeq(int authSeq);
	int check(AuthDto dto);
	void remove(int authSeq);
	void add(Map<String, String> map);
	void set(Map<String, String> map);
}
