package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the application_data database table.
 * 
 */
@Entity
@Table(name="application_data")
@NamedQuery(name="Application.findAll", query="SELECT a FROM Application a")
public class Application implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="application_id", unique=true, nullable=false)
	private int applicationId;

	@Column(name="candidate_comments", length=1440)
	private String candidateComments;

	@Column(name="emp_city", length=32)
	private String empCity;

	@Column(name="emp_country", length=32)
	private String empCountry;

	@Temporal(TemporalType.DATE)
	@Column(name="emp_current_expire_date")
	private Date empCurrentExpireDate;

	@Column(name="emp_discipline", length=45)
	private String empDiscipline;

	@Column(name="emp_it_experience")
	private int empItExperience;

	@Column(name="emp_job_level", length=45)
	private String empJobLevel;

	@Column(name="emp_job_role", length=45)
	private String empJobRole;

	@Column(name="emp_job_role_group", length=45)
	private String empJobRoleGroup;

	@Column(name="emp_location", length=32)
	private String empLocation;

	@Column(name="emp_pratice", length=45)
	private String empPratice;

	@Column(name="emp_sevice_line", length=45)
	private String empSeviceLine;

	@Column(name="emp_specialism", length=45)
	private String empSpecialism;

	@Column(name="enguagements_since")
	private byte enguagementsSince;

	private byte expired;

	@Column(name="is_recertification", nullable=false)
	private byte isRecertification;

	@Column(name="special_achivements", length=1440)
	private String specialAchivements;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="employee_id")
	private Employee employee;

	//bi-directional many-to-many association to Qualification
	@ManyToMany
	@JoinTable(
		name="personal_qualification"
		, joinColumns={
			@JoinColumn(name="application_id", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="qualification_id", nullable=false)
			}
		)
	private List<Qualification> qualifications;

	//bi-directional many-to-many association to Employee
	@ManyToMany(mappedBy="applicationData2")
	private List<Employee> refEmployees;

	//bi-directional many-to-one association to WorkExperience
	@OneToMany(mappedBy="applicationData")
	private List<WorkExperience> workExperiences;

	public Application() {
	}

	public int getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public String getCandidateComments() {
		return this.candidateComments;
	}

	public void setCandidateComments(String candidateComments) {
		this.candidateComments = candidateComments;
	}

	public String getEmpCity() {
		return this.empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	public String getEmpCountry() {
		return this.empCountry;
	}

	public void setEmpCountry(String empCountry) {
		this.empCountry = empCountry;
	}

	public Date getEmpCurrentExpireDate() {
		return this.empCurrentExpireDate;
	}

	public void setEmpCurrentExpireDate(Date empCurrentExpireDate) {
		this.empCurrentExpireDate = empCurrentExpireDate;
	}

	public String getEmpDiscipline() {
		return this.empDiscipline;
	}

	public void setEmpDiscipline(String empDiscipline) {
		this.empDiscipline = empDiscipline;
	}

	public int getEmpItExperience() {
		return this.empItExperience;
	}

	public void setEmpItExperience(int empItExperience) {
		this.empItExperience = empItExperience;
	}

	public String getEmpJobLevel() {
		return this.empJobLevel;
	}

	public void setEmpJobLevel(String empJobLevel) {
		this.empJobLevel = empJobLevel;
	}

	public String getEmpJobRole() {
		return this.empJobRole;
	}

	public void setEmpJobRole(String empJobRole) {
		this.empJobRole = empJobRole;
	}

	public String getEmpJobRoleGroup() {
		return this.empJobRoleGroup;
	}

	public void setEmpJobRoleGroup(String empJobRoleGroup) {
		this.empJobRoleGroup = empJobRoleGroup;
	}

	public String getEmpLocation() {
		return this.empLocation;
	}

	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}

	public String getEmpPratice() {
		return this.empPratice;
	}

	public void setEmpPratice(String empPratice) {
		this.empPratice = empPratice;
	}

	public String getEmpSeviceLine() {
		return this.empSeviceLine;
	}

	public void setEmpSeviceLine(String empSeviceLine) {
		this.empSeviceLine = empSeviceLine;
	}

	public String getEmpSpecialism() {
		return this.empSpecialism;
	}

	public void setEmpSpecialism(String empSpecialism) {
		this.empSpecialism = empSpecialism;
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

	public byte getIsRecertification() {
		return this.isRecertification;
	}

	public void setIsRecertification(byte isRecertification) {
		this.isRecertification = isRecertification;
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

	public List<Qualification> getQualifications() {
		return this.qualifications;
	}

	public void setQualifications(List<Qualification> qualifications) {
		this.qualifications = qualifications;
	}

	public List<Employee> getRefEmployees() {
		return this.refEmployees;
	}

	public void setRefEmployees(List<Employee> refEmployees) {
		this.refEmployees = refEmployees;
	}

	public List<WorkExperience> getWorkExperiences() {
		return this.workExperiences;
	}

	public void setWorkExperiences(List<WorkExperience> workExperiences) {
		this.workExperiences = workExperiences;
	}

	public WorkExperience addWorkExperience(WorkExperience workExperience) {
		getWorkExperiences().add(workExperience);
		workExperience.setApplicationData(this);

		return workExperience;
	}

	public WorkExperience removeWorkExperience(WorkExperience workExperience) {
		getWorkExperiences().remove(workExperience);
		workExperience.setApplicationData(null);

		return workExperience;
	}

}