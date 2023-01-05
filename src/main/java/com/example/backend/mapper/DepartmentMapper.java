package com.example.backend.mapper;

import java.util.List;

import com.example.backend.dto.DepartmentDto;

public interface DepartmentMapper {
   
   List<DepartmentDto> getDeptNameList(DepartmentDto dto);

}