package com.service;

import com.dao.StudentDao;

public class StudentService {
	public void insertData() {
		StudentDao ed = new StudentDao();
		ed.insertData();
	}
	public void updateData() {
		StudentDao ed = new StudentDao();
		ed.updateData();
	}
	public void deleteData() {
		StudentDao ed = new StudentDao();
		ed.deleteData();
	}
	public void displayData() {
		StudentDao ed= new StudentDao();
		ed.displayDao();
	}
}
