package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the application_data database table.
 * 
 */
@Entity
@Table(name="application_data")
@NamedQuery(name="ApplicationData.findAll", query="SELECT a FROM ApplicationData a")
public class ApplicationData implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ApplicationDataPK id;

	@Column(name="candidate_comments", length=1440)
	private String candidateComments;

	@Column(name="enguagements_since")
	private byte enguagementsSince;

	private byte expired;

	@Column(name="special_achivements", length=1440)
	private String specialAchivements;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="employee_id")
	private Employee employee;

	public ApplicationData() {
	}

	public ApplicationDataPK getId() {
		return this.id;
	}

	public void setId(ApplicationDataPK id) {
		this.id = id;
	}

	public String getCandidateComments() {
		return this.candidateComments;
	}

	public void setCandidateComments(String candidateComments) {
		this.candidateComments = candidateComments;
	}

	public byte getEnguagementsSince() {
		return this.enguagementsSince;
	}

	public void setEnguagementsSince(byte enguagementsSince) {
		this.enguagementsSince = enguagementsSince;
	}

	public byte getExpired() {
		return this.expired;
	}

	public void setExpired(byte expired) {
		this.expired = expired;
	}

	public String getSpecialAchivements() {
		return this.specialAchivements;
	}

	public void setSpecialAchivements(String specialAchivements) {
		this.specialAchivements = specialAchivements;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}