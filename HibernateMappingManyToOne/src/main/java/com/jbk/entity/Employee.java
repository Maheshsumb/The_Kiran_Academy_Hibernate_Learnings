package com.jbk.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee { //Many
	
	@Id
	private int eId;
	private String eName;
	private String Salary;
	
	@ManyToOne()
	@JoinColumn(name="emp_dept")
	Department dept;

	public Employee() {
	
	}

	public Employee(int eId, String eName, String salary, Department dept) {
		super();
		this.eId = eId;
		this.eName = eName;
		Salary = salary;
		this.dept = dept;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getSalary() {
		return Salary;
	}

	public void setSalary(String salary) {
		Salary = salary;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", Salary=" + Salary + ", dept=" + dept + "]";
	}
	
	
	

}
