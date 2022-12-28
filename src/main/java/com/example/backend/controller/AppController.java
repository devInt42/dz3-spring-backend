package com.example.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	@RequestMapping("/")
	public String mainPage(Model model) {
		model.addAttribute("innerPage","index");
		System.out.println("hi");
		return "pageContainer";
	}
}