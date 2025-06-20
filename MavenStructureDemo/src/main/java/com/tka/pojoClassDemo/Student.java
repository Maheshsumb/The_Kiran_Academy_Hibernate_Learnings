package com.tka.pojoClassDemo;

public class Student {

	// POJO : Plain object java object

	String sName;
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
	

}
