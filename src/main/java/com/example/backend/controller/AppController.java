package com.example.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class AppController {
	@RequestMapping("/")
	public String mainPage(Model model) {
		model.addAttribute("innerPage","index");
		System.out.println("hi");
		return "pageContainer";
	}
}