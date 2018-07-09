package com.example.demo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Application;
import com.example.demo.repository.AppRepository;

@Repository
public class AppServiceImpl implements AppService {
	
	@Autowired
	private AppRepository aRepo;
	

	@Override
	@Transactional
	public Application submitApplicationService(int employeeID, Application app) {	
		return aRepo.save(app);
	}

}
