package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="StudentData")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int sID;
	String sName;
	String sCity;
	int sAge;

	public Student() {
		super();
	}

	public Student(int sID, String sName, String sCity, int sAge) {
		super();
		this.sID = sID;
		this.sName = sName;
		this.sCity = sCity;
		this.sAge = sAge;
	}

	public int getsID() {
		return sID;
	}

	public void setsID(int sID) {
		this.sID = sID;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsCity() {
		return sCity;
	}

	public void setsCity(String sCity) {
		this.sCity = sCity;
	}

	public int getsAge() {
		return sAge;
	}

	public void setsAge(int sAge) {
		this.sAge = sAge;
	}

	@Override
	public String toString() {
		return "Student [sID=" + sID + ", sName=" + sName + ", sCity=" + sCity + ", sAge=" + sAge + "]";
	}

}
