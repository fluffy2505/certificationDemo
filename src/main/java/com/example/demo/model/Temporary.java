package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the temporary database table.
 * 
 */
@Entity
@Table(name="temporary")
@NamedQuery(name="Temporary.findAll", query="SELECT t FROM Temporary t")
public class Temporary implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="tmp_application_id", unique=true, nullable=false)
	private int tmpApplicationId;

	@Column(name="employee_id")
	private int employeeId;

	@Column(name="tmp_application_data", length=20000)
	private String tmpApplicationData;

	public Temporary() {
	}

	public int getTmpApplicationId() {
		return this.tmpApplicationId;
	}

	public void setTmpApplicationId(int tmpApplicationId) {
		this.tmpApplicationId = tmpApplicationId;
	}

	public int getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getTmpApplicationData() {
		return this.tmpApplicationData;
	}

	public void setTmpApplicationData(String tmpApplicationData) {
		this.tmpApplicationData = tmpApplicationData;
	}

}