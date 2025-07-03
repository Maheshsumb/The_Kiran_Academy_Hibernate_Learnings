package com.dao;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Remove;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entities.Student;

public class EmployeeDao {
	Scanner sc = new Scanner(System.in);

	public void insertData() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		System.out.println("<-----Insert Data----->");
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student data like Name,Age,City");
		s.setsName(sc.next());
		s.setsAge(sc.nextInt());
		s.setsCity(sc.next());
		ss.persist(s);
		System.out.println("Data Inserted...");
		tr.commit();
		ss.close();

	}

	public void updateData() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		System.out.println("<-----Update Data----->");

		System.out.print("Enter id to update data");
		int id = sc.nextInt();
		Student s = ss.get(Student.class, id);
		System.out.println("Enter Student data like Name,Age,City");
		s.setsName(sc.next());
		s.setsAge(sc.nextInt());
		s.setsCity(sc.next());
//		ss.update(s);      Deprecated
		ss.merge(s);
		System.out.println("Data Updated...");
		tr.commit();
		ss.close();
	}

	public void deleteData() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		System.out.println("<-----Delete Data----->");

		System.out.print("Enter id to Delete data");
		int id = sc.nextInt();
		Student s = ss.get(Student.class, id);
//		ss.delete(s);      Deprecated
		ss.remove(s);
		System.out.println("Data Delated...");
		tr.commit();
		ss.close();
	}

	public void displayDao() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		// Display Operation Using HQL Query
		
		String hqlQuery="from Student";
		Query<Student> query= ss.createQuery(hqlQuery, Student.class);
		List<Student> lst= query.list();
		
	for (Student student : lst) {
		System.out.println(student);
	}
		tr.commit();
		ss.close();
	}

}
