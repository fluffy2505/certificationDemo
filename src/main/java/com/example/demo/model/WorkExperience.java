package com.example.demo.model;

import java.util.Date;

public class WorkExperience {

	private int employeeID;
	private int workExperienceID;
	private Date startDate;
	private Date endDate;
	private String jobTilte;
	private String jobDuty;
	private String result;

	public WorkExperience() {
		super();
	}

	public WorkExperience(int employeeID, int workExperienceID, Date startDate, Date endDate, String jobTilte,
			String jobDuty, String result) {
		super();
		this.employeeID = employeeID;
		this.workExperienceID = workExperienceID;
		this.startDate = startDate;
		this.endDate = endDate;
		this.jobTilte = jobTilte;
		this.jobDuty = jobDuty;
		this.result = result;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public Date getEndDate() {
		return endDate;
	}

	public String getJobDuty() {
		return jobDuty;
	}

	public String getJobTilte() {
		return jobTilte;
	}

	public String getResult() {
		return result;
	}

	public Date getStartDate() {
		return startDate;
	}

	public int getWorkExperienceID() {
		return workExperienceID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public void setJobDuty(String jobDuty) {
		this.jobDuty = jobDuty;
	}

	public void setJobTilte(String jobTilte) {
		this.jobTilte = jobTilte;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public void setWorkExperienceID(int workExperienceID) {
		this.workExperienceID = workExperienceID;
	}

}
