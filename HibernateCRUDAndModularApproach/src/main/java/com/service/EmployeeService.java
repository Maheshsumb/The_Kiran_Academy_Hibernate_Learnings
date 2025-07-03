package com.service;

import com.dao.EmployeeDao;

public class EmployeeService {
	public void insertData() {
		EmployeeDao ed = new EmployeeDao();
		ed.insertData();
	}
	public void updateData() {
		EmployeeDao ed = new EmployeeDao();
		ed.updateData();
	}
	public void deleteData() {
		EmployeeDao ed = new EmployeeDao();
		ed.deleteData();
	}
	public void displayData() {
		EmployeeDao ed= new EmployeeDao();
		ed.displayDao();
	}
}
