package com.jbk;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int empId;
	String empName;
	@Column (name="empAddress")
	String empCity;
	String empSalrary;
	String Department;
	
	
	public Employee() {
		
	}
	public Employee(int empId, String empName, String empAddress, String empSalrary, String department) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empCity = empAddress;
		this.empSalrary = empSalrary;
		Department = department;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getEmpCity() {
		return empCity;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	public String getEmpSalrary() {
		return empSalrary;
	}
	public void setEmpSalrary(String empSalrary) {
		this.empSalrary = empSalrary;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empCity=" + empCity + ", empSalrary="
				+ empSalrary + ", Department=" + Department + "]";
	}
	
}
