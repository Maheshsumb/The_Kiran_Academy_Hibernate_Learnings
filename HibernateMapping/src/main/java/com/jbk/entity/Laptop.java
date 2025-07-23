package com.jbk.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Laptop {
	@Id
	int iId;
	String lName;
	public Laptop() {
		
	}
	public Laptop(int iId, String lName) {
		super();
		this.iId = iId;
		this.lName = lName;
	}
	public int getiId() {
		return iId;
	}
	public void setiId(int iId) {
		this.iId = iId;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	@Override
	public String toString() {
		return "Laptop [iId=" + iId + ", lName=" + lName + "]";
	}
	
	

}
