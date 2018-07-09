package com.example.util;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.model.Application;
import com.example.demo.model.TemApplication;

public class utils {
	TemApplication applcationToTemApplication(int employeeID, Application app) {
		TemApplication temApp = new TemApplication();
		
		temApp.setEmployeeId(employeeID);
		String tmpApplicationData = JSONObject.toJSONString(app);
		temApp.setTmpApplicationData(tmpApplicationData);
		
		return temApp;
	}
	
	Application temApplcationToApplication(TemApplication temApp) {
		Application app = JSONObject.parseObject(temApp.getTmpApplicationData(), Application.class);
		return app;
	}
}
