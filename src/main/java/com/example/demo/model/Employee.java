package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the employee database table.
 * 
 */
@Entity
@Table(name="employee")
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="employee_id", unique=true, nullable=false)
	private int employeeId;

	@Column(length=50)
	private String email;

	@Column(name="first_name", length=20)
	private String firstName;

	@Column(name="last_name", nullable=false, length=20)
	private String lastName;

	@Column(name="phone_num")
	private int phoneNum;

	@Temporal(TemporalType.DATE)
	@Column(name="start_date")
	private Date startDate;

	//bi-directional many-to-one association to Application
	@OneToMany(mappedBy="employee")
	private List<Application> applicationData1;

	//bi-directional many-to-one association to CertificationRecord
	@OneToMany(mappedBy="employee")
	private List<CertificationRecord> certificationRecords;

	//bi-directional many-to-many association to Application
	@ManyToMany
	@JoinTable(
		name="reference"
		, joinColumns={
			@JoinColumn(name="refer_employee_id", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="application_id", nullable=false)
			}
		)
	private List<Application> applicationData2;

	public Employee() {
	}

	public int getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPhoneNum() {
		return this.phoneNum;
	}

	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public List<Application> getApplicationData1() {
		return this.applicationData1;
	}

	public void setApplicationData1(List<Application> applicationData1) {
		this.applicationData1 = applicationData1;
	}

	public Application addApplicationData1(Application applicationData1) {
		getApplicationData1().add(applicationData1);
		applicationData1.setEmployee(this);

		return applicationData1;
	}

	public Application removeApplicationData1(Application applicationData1) {
		getApplicationData1().remove(applicationData1);
		applicationData1.setEmployee(null);

		return applicationData1;
	}

	public List<CertificationRecord> getCertificationRecords() {
		return this.certificationRecords;
	}

	public void setCertificationRecords(List<CertificationRecord> certificationRecords) {
		this.certificationRecords = certificationRecords;
	}

	public CertificationRecord addCertificationRecord(CertificationRecord certificationRecord) {
		getCertificationRecords().add(certificationRecord);
		certificationRecord.setEmployee(this);

		return certificationRecord;
	}

	public CertificationRecord removeCertificationRecord(CertificationRecord certificationRecord) {
		getCertificationRecords().remove(certificationRecord);
		certificationRecord.setEmployee(null);

		return certificationRecord;
	}

	public List<Application> getApplicationData2() {
		return this.applicationData2;
	}

	public void setApplicationData2(List<Application> applicationData2) {
		this.applicationData2 = applicationData2;
	}

}