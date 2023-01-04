package com.example.backend.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.backend.dto.MenuDto;

@Mapper
public interface MenuMapper {
	List<MenuDto> getMenuList();
}
