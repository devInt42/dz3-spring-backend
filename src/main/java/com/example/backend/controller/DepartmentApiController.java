package com.example.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.dto.DepartmentDto;
import com.example.backend.service.DepartmentServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/dept")
public class DepartmentApiController {
   
   @Autowired
   private DepartmentServiceImpl deptService;
   
   //전체 리스트 중 dept_name만 출력
   @GetMapping("/deptNameList")
   public List<DepartmentDto> getDeptNameList(DepartmentDto dto){
      return deptService.getDeptNameList(dto);
   }
}