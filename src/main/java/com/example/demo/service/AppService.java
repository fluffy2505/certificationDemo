package com.example.demo.service;

import com.example.demo.model.Application;
import java.util.Map;

public interface AppService {
	
	boolean hasTemApplicationService(int employeeID);
	Map<Integer, Application> getTemApplicationServices(int employeeID);
	Application getTemApplicationService(int employeeID, int temAppID);
	Application submitApplicationService(int employeeID, Application app);
	
}
