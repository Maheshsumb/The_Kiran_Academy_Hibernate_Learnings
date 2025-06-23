package com.jbk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		Configuration cfg =  new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory sf =cfg.buildSessionFactory();
		Session ss=sf.openSession();
		 Transaction tr=ss.beginTransaction();
		 
		 Employee e=new Employee();
		 e.setEmpName("Mahii");
		 e.setEmpCity("pune");
		 e.setDepartment("HR");
		 e.setEmpSalrary("345655");
		 
		 ss.persist(e);
		 tr.commit();
		 ss.close();
		
		 

	}

}
