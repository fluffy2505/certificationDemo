package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the work_experience database table.
 * 
 */
@Entity
@Table(name="work_experience")
@NamedQuery(name="WorkExperience.findAll", query="SELECT w FROM WorkExperience w")
public class WorkExperience implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="experience_id", unique=true, nullable=false)
	private int experienceId;

	@Temporal(TemporalType.DATE)
	@Column(name="end_date")
	private Date endDate;

	@Column(name="job_duty", length=1440)
	private String jobDuty;

	@Column(name="job_title", length=128)
	private String jobTitle;

	@Column(length=1440)
	private String result;

	@Temporal(TemporalType.DATE)
	@Column(name="start_date")
	private Date startDate;

	//bi-directional many-to-one association to Application
	@ManyToOne
	@JoinColumn(name="application_id", nullable=false)
	private Application applicationData;

	public WorkExperience() {
	}

	public int getExperienceId() {
		return this.experienceId;
	}

	public void setExperienceId(int experienceId) {
		this.experienceId = experienceId;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getJobDuty() {
		return this.jobDuty;
	}

	public void setJobDuty(String jobDuty) {
		this.jobDuty = jobDuty;
	}

	public String getJobTitle() {
		return this.jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Application getApplicationData() {
		return this.applicationData;
	}

	public void setApplicationData(Application applicationData) {
		this.applicationData = applicationData;
	}

}