package com.example.backend.mapper;

import java.util.List;
import java.util.Map;

import com.example.backend.dto.mapping.AuthMenuDto;

public interface AuthMenuMapper {
	List<AuthMenuDto> getList(int authSeq);
	void remove(Map<String, String> map);
	void add(Map<String, String> map);
	void set(Map<String, String> map);
}
