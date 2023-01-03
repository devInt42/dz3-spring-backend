package com.example.backend.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.backend.dto.DeptDto;

@Mapper
public interface DeptMapper {
	List<DeptDto> getList();

	// user 삽입
	void insertDept(Map<String, String> map);

	// user 삭제
	int deleteDept(int dept_code);

	// user 수정
	int updateDept(DeptDto dto);

	// user 검색
	List<DeptDto> getSearchDept(int dept_code);
}
