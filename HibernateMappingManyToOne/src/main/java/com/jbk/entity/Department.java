package com.jbk.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department { //One
	
	@Id
	private int dId;
	private String dName;
	
	@OneToMany(mappedBy = "dept")
	List<Employee>  emp ;
	
	

	public Department() {
	
	}

	public Department(int dId, String dName, List<Employee> emp) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.emp = emp;
	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(ArrayList list) {
		this.emp = list;
	}

	@Override
	public String toString() {
		return "Department [dId=" + dId + ", dName=" + dName + ", emp=" + emp + "]";
	}
	
	
	

}
