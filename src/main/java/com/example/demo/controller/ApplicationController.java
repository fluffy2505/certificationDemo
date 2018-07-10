package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@Controller
public class ApplicationController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	@RequestMapping("/")
	public String sayHello(Model model ) {
	
		model.addAttribute("hello", "application controller say hello");
		return "index";
	}
	
	
	@RequestMapping(value="/{arg}", method=RequestMethod.GET)
	public String getLogin(@PathVariable("arg") String arg, Model m) {
		
		Employee e = new Employee();
		m.addAttribute("name", e);
		arg = "Login";
		return arg;
	}
	
	@RequestMapping(value="/{arg}", method=RequestMethod.POST)
	public String check(@ModelAttribute("name") Employee e,@PathVariable("arg")String arg) {
		
		//input error check here here
		//0 or not valid use eService
		if(e.getEmployeeId() == 0){
			System.out.println(e.getEmployeeId());
			System.err.println(employeeService.hasEmployeeService(e.getEmployeeId()));
			arg = "Login";
			return arg;
		}
		
		//if true go to next page
		else if(employeeService.hasEmployeeService(e.getEmployeeId())) {
			System.err.println(employeeService.hasEmployeeService(e.getEmployeeId()));
			arg ="PortalHub";
			return arg;
		}
		//false go to home page 
		else {
			System.err.println(employeeService.hasEmployeeService(e.getEmployeeId()));
			arg = "Login";
			return arg;
		}
	}
	
	
}
