package com.example.backend.service;

import java.util.List;

import com.example.backend.dto.User2Dto;

public interface User2Service {
	// user 리스트
	List<User2Dto> getUser2List();
	
	// user 삽입
	void insertUser2(User2Dto dto);
	
	// user 삭제
	int deleteUser2(User2Dto dto);
	
	// user 수정
	int updateUser2(User2Dto dto);
	
	// user 검색
	List<User2Dto> getSearchUser2(int id);
}
