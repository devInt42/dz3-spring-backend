package com.example.backend.mapper;

import java.util.List;
import java.util.Map;

import com.example.backend.dto.MenuDto;

public interface MenuMapper {
	List<MenuDto> getList(MenuDto dto);
	MenuDto getBySeq(int menuSeq);
	void remove(int menuSeq);
	void add(Map<String, String> map);
	void set(Map<String, String> map);
}
