package com.example.demo.service;

import com.example.demo.model.Application;

public interface TemAppService {

	boolean saveTemApplicationService(int employeeID, Application app);
	boolean deleteTemApplicationService(int employeeID, int temAppID);
}
