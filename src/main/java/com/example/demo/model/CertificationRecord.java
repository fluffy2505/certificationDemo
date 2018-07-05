package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the certification_record database table.
 * 
 */
@Entity
@Table(name="certification_record")
@NamedQuery(name="CertificationRecord.findAll", query="SELECT c FROM CertificationRecord c")
public class CertificationRecord implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="certification_id", unique=true, nullable=false)
	private int certificationId;

	@Column(length=45)
	private String currentLevel;

	@Temporal(TemporalType.DATE)
	private Date date;

	@Temporal(TemporalType.DATE)
	@Column(name="expiry_date")
	private Date expiryDate;

	@Column(length=3)
	private String grade;

	@Column(name="re_certificated")
	private byte reCertificated;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="employee_id", nullable=false)
	private Employee employee;

	public CertificationRecord() {
	}

	public int getCertificationId() {
		return this.certificationId;
	}

	public void setCertificationId(int certificationId) {
		this.certificationId = certificationId;
	}

	public String getCurrentLevel() {
		return this.currentLevel;
	}

	public void setCurrentLevel(String currentLevel) {
		this.currentLevel = currentLevel;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getExpiryDate() {
		return this.expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public byte getReCertificated() {
		return this.reCertificated;
	}

	public void setReCertificated(byte reCertificated) {
		this.reCertificated = reCertificated;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}