package com.controller;

import com.service.StudentService;

public class StudentController {
public static void main(String[] args) {
	StudentService es = new StudentService();
	es.insertData();
	es.updateData();
	es.deleteData();
	es.displayData();
	
	
}
}
