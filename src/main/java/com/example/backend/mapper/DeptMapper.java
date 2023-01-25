package com.example.backend.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.backend.dto.DeptDto;

@Mapper
public interface DeptMapper {
	List<DeptDto> getList();

	// 부서 삽입
	void insertDept(Map<String, String> map);

	// 부서 삭제
	int deleteDept(int dept_code);

	// 부서 수정
	int updateDept(DeptDto dto);

	// 부서 검색
	List<DeptDto> getSearchDept(int dept_code);
}
