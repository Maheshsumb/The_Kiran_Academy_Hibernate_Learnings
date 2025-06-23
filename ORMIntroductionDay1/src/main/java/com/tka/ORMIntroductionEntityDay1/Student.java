package com.tka.ORMIntroductionEntityDay1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity  // Marks class name as an database table name
@Table(name="StudentRecords")   // Explicitly Declare the Table name in DB 
public class Student {

	// POJO : Plain object java object
	@Id  // Used to declare a primary key field in DB Table 
	@GeneratedValue(strategy = GenerationType.IDENTITY)  // used implement AUTO_ICREMENT Features 
	int sID;
	String sName;
	@Column(name="sAddress")  //Used to explicitly declare field/column name
	String sCity;
	int sAge;
	
	

	public Student() {
		
	}
	

	public Student(String sName, String sCity, int sAge) {
		super();
		this.sName = sName;
		this.sCity = sCity;
		this.sAge = sAge;
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
		return "Student [sName=" + sName + ", sCity=" + sCity + ", sAge=" + sAge + "]";
	}
	
	
	public static void main(String[] args) {
		
	}

}
