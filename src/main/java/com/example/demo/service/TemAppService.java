package com.example.demo.service;

import java.util.Map;

import com.example.demo.model.Application;

public interface TemAppService {

	boolean saveTemApplicationService(int employeeID, Application app);
	boolean deleteTemApplicationService(int employeeID, int temAppID);
	boolean hasTemApplicationService(int employeeID);
	Map<Integer, Application> getTemApplicationServices(int employeeID);
	Application getTemApplicationService(int employeeID, int temAppID);
}

