package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicationController {

	@RequestMapping("/hello")
	public String sayHello(Model model) {
	
		model.addAttribute("hello", "application controller say hello");
		return "hello";
	}
	
}
