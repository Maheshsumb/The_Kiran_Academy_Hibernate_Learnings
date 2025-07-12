package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Hospital {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int patientId;
	String pName;
	int pAge;
	String pCity;

	public Hospital() {

	}

	public Hospital(int patientId, String pName, int pAge, String pCity) {
		super();
		this.patientId = patientId;
		this.pName = pName;
		this.pAge = pAge;
		this.pCity = pCity;
	}
	

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpAge() {
		return pAge;
	}

	public void setpAge(int pAge) {
		this.pAge = pAge;
	}

	public String getpCity() {
		return pCity;
	}

	public void setpCity(String pCity) {
		this.pCity = pCity;
	}

	@Override
	public String toString() {
		return "Hospital [patientId=" + patientId + ", pName=" + pName + ", pAge=" + pAge + ", pCity=" + pCity + "]";
	}

}
