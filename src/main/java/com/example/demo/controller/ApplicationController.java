package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ApplicationController {

	@RequestMapping("/")
	public String sayHello(Model model ) {
	
		model.addAttribute("hello", "application controller say hello");
		return "index";
	}
	
	
	@RequestMapping(value="/{arg}", method=RequestMethod.GET)
	public String sayHello(@PathVariable("arg") String arg) {
		arg = "Login";
		return arg;
	}
}
