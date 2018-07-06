package com.example.demo.model;

import java.util.Date;
import java.util.List;

public class Employee {
	private int employeeID;
	private String firstname;
	private String lastname;
	private String email;
	private String phone;
	private Date startDate;
	
	List<Qualification> quas;   /* ??? */
	
	
	//Constructor
	public Employee(int employeeID, String firstname, String lastname, String email, String phone, Date startDate) {
		super();
		this.employeeID = employeeID;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
		this.startDate = startDate;
	}

	public String getEmail() {
		return email;
	}


	public int getEmployeeID() {
		return employeeID;
	}


	public String getFirstname() {
		return firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public String getPhone() {
		return phone;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
}
