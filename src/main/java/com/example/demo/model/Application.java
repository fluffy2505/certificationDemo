package com.example.demo.model;

public class Application {
	private int applicationID;
	private int employeeID;
	private boolean reCertificated;
	private int repeated;
	
	public Application(int employeeID, boolean reCertificated, int repeated) {
		super();
		this.employeeID = employeeID;
		this.reCertificated = reCertificated;
		this.repeated = repeated;
	}

	public int getApplicationID() {
		return applicationID;
	}

	public void setApplicationID(int applicationID) {
		this.applicationID = applicationID;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public boolean isReCertificated() {
		return reCertificated;
	}

	public void setReCertificated(boolean reCertificated) {
		this.reCertificated = reCertificated;
	}

	public int getRepeated() {
		return repeated;
	}

	public void setRepeated(int repeated) {
		this.repeated = repeated;
	}
	
	
	
}
