package com.example.demo.service;

import com.example.demo.model.Application;
import java.util.Map;

public interface AppService {
	
	Application submitApplicationService(int employeeID, Application app);
	
}
