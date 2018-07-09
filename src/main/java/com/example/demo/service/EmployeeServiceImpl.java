package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository eRepo;

	@Override
	public boolean hasEmployeeService(int employeeID) {
		return eRepo.existsById(employeeID);
	}
	

}
