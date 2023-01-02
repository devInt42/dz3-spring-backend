package com.example.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.dto.User2Dto;
import com.example.backend.service.User2ServiceImpl;

@RestController
@RequestMapping("/user")
public class User2Controller {
	@Autowired
	private User2ServiceImpl user2Service;
	
	@GetMapping("/userlist")
	public List<User2Dto> getUser2List(){
		System.out.println();
		System.out.println(user2Service.getUser2List());
		return user2Service.getUser2List();
	}
	
	@PostMapping
	public void insertUser2(User2Dto dto) {
		user2Service.insertUser2(dto);
	}
	
	@GetMapping("/delete")
	public int deleteUser2(User2Dto dto) {
		return user2Service.deleteUser2(dto);
	}
	
	@GetMapping("/update")
	public int updateUser2(User2Dto dto) {
		return user2Service.updateUser2(dto);
	}
	
	@GetMapping("/usersearch")
	public List<User2Dto> getSearchUser2(){
		return user2Service.getSearchUser2(0);
	}

}
