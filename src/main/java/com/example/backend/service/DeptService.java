package com.example.backend.service;

import java.util.List;
import java.util.Map;

import com.example.backend.dto.DeptDto;

public interface DeptService {

	// user 리스트
	List<DeptDto> getDeptList();

	// user 삽입
	void insertDept(Map<String, String> map);

	// user 삭제
	int deleteDept(int dept_code);

	// user 수정
	int updateDept(DeptDto dto);

	// user 검색
	List<DeptDto> getSearchDept(int id);
}
