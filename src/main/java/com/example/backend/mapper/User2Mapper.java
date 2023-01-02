package com.example.backend.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.backend.dto.User2Dto;

@Mapper
public interface User2Mapper {
	
	List<User2Dto> getList();

	// user 삽입
	void insertUser2(User2Dto dto);

	// user 삭제
	int deleteUser2(User2Dto dto);

	// user 수정
	int updateUser2(User2Dto dto);

	// user 검색
	List<User2Dto> getSearchUser2(int id);
}
