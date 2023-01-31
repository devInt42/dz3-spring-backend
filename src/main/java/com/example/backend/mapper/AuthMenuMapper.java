package com.example.backend.mapper;

import java.util.List;
import java.util.Map;

import com.example.backend.dto.mapping.AuthMenuDto;

public interface AuthMenuMapper {
	List<AuthMenuDto> getList(int authSeq);

	void add(List<Object> list);

	void remove(List<Object> list);
}
