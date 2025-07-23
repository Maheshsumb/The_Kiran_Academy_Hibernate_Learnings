package com.jbk.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int sId;
	String sName;
	String SCity;
	@OneToOne
	Laptop laptop;
	public Student() {
		
	}
	public Student(int sId, String sName, String sCity, Laptop laptop) {
		super();
		this.sId = sId;
		this.sName = sName;
		SCity = sCity;
		this.laptop = laptop;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getSCity() {
		return SCity;
	}
	public void setSCity(String sCity) {
		SCity = sCity;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", SCity=" + SCity + ", laptop=" + laptop + "]";
	}
	
	
	

}
