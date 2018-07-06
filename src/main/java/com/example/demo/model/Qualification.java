package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the qualification database table.
 * 
 */
@Entity
@Table(name="qualification")
@NamedQuery(name="Qualification.findAll", query="SELECT q FROM Qualification q")
public class Qualification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="qualification_id", unique=true, nullable=false)
	private int qualificationId;

	@Column(nullable=false, length=500)
	private String description;

	@Column(name="level_num", nullable=false)
	private int levelNum;

	@Column(nullable=false, length=45)
	private String title;

	@Column(nullable=false, length=5)
	private String type;

	//bi-directional many-to-many association to Application
	@ManyToMany(mappedBy="qualifications")
	private List<Application> applicationData;

	public Qualification() {
	}

	public int getQualificationId() {
		return this.qualificationId;
	}

	public void setQualificationId(int qualificationId) {
		this.qualificationId = qualificationId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getLevelNum() {
		return this.levelNum;
	}

	public void setLevelNum(int levelNum) {
		this.levelNum = levelNum;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Application> getApplicationData() {
		return this.applicationData;
	}

	public void setApplicationData(List<Application> applicationData) {
		this.applicationData = applicationData;
	}

}