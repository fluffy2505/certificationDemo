package com.example.demo.model;

enum qType {CERTIFICATION, QUALIFICATION}

public class Qualification {
	private int qualificationID;
	private qType type;
	private String desc;
	private int level;
	
	
	public Qualification(int qualificationID, qType type, String desc, int level) {
		super();
		this.qualificationID = qualificationID;
		this.type = type;
		this.desc = desc;
		this.level = level;
	}


	public int getQualificationID() {
		return qualificationID;
	}


	public void setQualificationID(int qualificationID) {
		this.qualificationID = qualificationID;
	}


	public qType getType() {
		return type;
	}


	public void setType(qType type) {
		this.type = type;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}
	
	
	
}
