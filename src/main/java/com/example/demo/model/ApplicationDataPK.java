package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the application_data database table.
 * 
 */
@Embeddable
public class ApplicationDataPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="application_id", unique=true, nullable=false)
	private int applicationId;

	@Column(name="is_recertification", unique=true, nullable=false)
	private byte isRecertification;

	public ApplicationDataPK() {
	}
	public int getApplicationId() {
		return this.applicationId;
	}
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
	public byte getIsRecertification() {
		return this.isRecertification;
	}
	public void setIsRecertification(byte isRecertification) {
		this.isRecertification = isRecertification;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ApplicationDataPK)) {
			return false;
		}
		ApplicationDataPK castOther = (ApplicationDataPK)other;
		return 
			(this.applicationId == castOther.applicationId)
			&& (this.isRecertification == castOther.isRecertification);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.applicationId;
		hash = hash * prime + ((int) this.isRecertification);
		
		return hash;
	}
}