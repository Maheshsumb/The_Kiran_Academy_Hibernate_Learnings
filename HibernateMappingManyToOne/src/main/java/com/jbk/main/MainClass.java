package com.jbk.main;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jbk.entity.Department;
import com.jbk.entity.Employee;

public class MainClass {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		cfg.addAnnotatedClass(Department.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss=  sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Department d = new Department();
		d.setdId(1000);
		d.setdName("Developer");
		
		Employee e1= new Employee();
		e1.seteId(1001);
		e1.seteName("Mahesh");
		e1.setSalary("10LPA");
		e1.setDept(d);
		
		Employee e2= new Employee();
		e2.seteId(1002);
		e2.seteName("Sahil");
		e2.setSalary("20LPA");
		e2.setDept(d);
		
		Employee e3= new Employee();
		e3.seteId(1003);
		e3.seteName("Ram");
		e3.setSalary("15LPA");
		e3.setDept(d);
		
		ArrayList list = new ArrayList();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		d.setEmp(list);
		
		ss.persist(e1);
		ss.persist(e2);
		ss.persist(e3);
		ss.persist(d);
		
		
		
		tr.commit();
		ss.close();
	}

}
