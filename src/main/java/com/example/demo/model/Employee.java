package com.example.demo.model;

import java.util.List;

public class Employee {
	int employeeID;
	String firstname;
	String lastname;
	String email;
	String phone;
	
	List<Qualification> quas;   /* ??? */
	
	
	//Constructor
	public Employee(int employeeID, String firstname, String lastname, String email, String phone) {
		super();
		this.employeeID = employeeID;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
	}


	public int getEmployeeID() {
		return employeeID;
	}


	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
}
