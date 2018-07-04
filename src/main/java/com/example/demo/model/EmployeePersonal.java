package com.example.demo.model;

import java.util.Date;

public class EmployeePersonal {
	int employeeId;
	String location;
	String city;
	String country;
	String jobRole;
	String jobLevel;
	String jobRoleGroup;
	String currentLevel;
	Date currentExpireDate;
	int itExperience;
	String serviceLine;
	String discipline;
	String practice;
	String specialism;

	public EmployeePersonal() {
		super();
	}

	public EmployeePersonal(int employeeId, String location, String city, String country, String jobRole,
			String jobLevel, String jobRoleGroup, String currentLevel, Date currentExpireDate, int itExperience,
			String serviceLine, String discipline, String practice, String specialism) {
		super();
		this.employeeId = employeeId;
		this.location = location;
		this.city = city;
		this.country = country;
		this.jobRole = jobRole;
		this.jobLevel = jobLevel;
		this.jobRoleGroup = jobRoleGroup;
		this.currentLevel = currentLevel;
		this.currentExpireDate = currentExpireDate;
		this.itExperience = itExperience;
		this.serviceLine = serviceLine;
		this.discipline = discipline;
		this.practice = practice;
		this.specialism = specialism;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public Date getCurrentExpireDate() {
		return currentExpireDate;
	}

	public String getCurrentLevel() {
		return currentLevel;
	}

	public String getDiscipline() {
		return discipline;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public int getItExperience() {
		return itExperience;
	}

	public String getJobLevel() {
		return jobLevel;
	}

	public String getJobRole() {
		return jobRole;
	}

	public String getJobRoleGroup() {
		return jobRoleGroup;
	}

	public String getLocation() {
		return location;
	}

	public String getPractice() {
		return practice;
	}

	public String getServiceLine() {
		return serviceLine;
	}

	public String getSpecialism() {
		return specialism;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setCurrentExpireDate(Date currentExpireDate) {
		this.currentExpireDate = currentExpireDate;
	}

	public void setCurrentLevel(String currentLevel) {
		this.currentLevel = currentLevel;
	}

	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setItExperience(int itExperience) {
		this.itExperience = itExperience;
	}

	public void setJobLevel(String jobLevel) {
		this.jobLevel = jobLevel;
	}

	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}

	public void setJobRoleGroup(String jobRoleGroup) {
		this.jobRoleGroup = jobRoleGroup;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setPractice(String practice) {
		this.practice = practice;
	}

	public void setServiceLine(String serviceLine) {
		this.serviceLine = serviceLine;
	}

	public void setSpecialism(String specialism) {
		this.specialism = specialism;
	}

}
