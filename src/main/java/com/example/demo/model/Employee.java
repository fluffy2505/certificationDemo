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

	//bi-directional many-to-one association to ApplicationData
	@OneToMany(mappedBy="employee")
	private List<ApplicationData> applicationData;

	//bi-directional many-to-one association to CertificationRecord
	@OneToMany(mappedBy="employee")
	private List<CertificationRecord> certificationRecords;

	//bi-directional many-to-one association to WorkExperience
	@OneToMany(mappedBy="employee")
	private List<WorkExperience> workExperiences;

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

	public List<ApplicationData> getApplicationData() {
		return this.applicationData;
	}

	public void setApplicationData(List<ApplicationData> applicationData) {
		this.applicationData = applicationData;
	}

	public ApplicationData addApplicationData(ApplicationData applicationData) {
		getApplicationData().add(applicationData);
		applicationData.setEmployee(this);

		return applicationData;
	}

	public ApplicationData removeApplicationData(ApplicationData applicationData) {
		getApplicationData().remove(applicationData);
		applicationData.setEmployee(null);

		return applicationData;
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

	public List<WorkExperience> getWorkExperiences() {
		return this.workExperiences;
	}

	public void setWorkExperiences(List<WorkExperience> workExperiences) {
		this.workExperiences = workExperiences;
	}

	public WorkExperience addWorkExperience(WorkExperience workExperience) {
		getWorkExperiences().add(workExperience);
		workExperience.setEmployee(this);

		return workExperience;
	}

	public WorkExperience removeWorkExperience(WorkExperience workExperience) {
		getWorkExperiences().remove(workExperience);
		workExperience.setEmployee(null);

		return workExperience;
	}

}