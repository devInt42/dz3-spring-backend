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
@RequestMapping("/department")
public class DepartmentApiController {
   @Autowired
   private DepartmentServiceImpl departmentService;
    @GetMapping("/list")
      public List<DepartmentDto> getDepartmentList(DepartmentDto dto){
         return departmentService.getDepartmentList(dto);
      }
}