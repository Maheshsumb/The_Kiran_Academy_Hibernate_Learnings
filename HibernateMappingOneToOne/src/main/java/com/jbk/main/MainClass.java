package com.jbk.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jbk.entity.Laptop;
import com.jbk.entity.Student;

public class MainClass {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		cfg.addAnnotatedClass(Laptop.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss=  sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Laptop l=new Laptop();
		l.setiId(12400);
		l.setlName("HP");
		ss.persist(l);
		
		Student s = new Student();
		s.setsName("Om");
		s.setSCity("Pune");
		s.setLaptop(l);
		ss.persist(s);
		tr.commit();
		ss.close();
	}

}
