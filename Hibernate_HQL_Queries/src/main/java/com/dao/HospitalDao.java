package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Hospital;

import jakarta.persistence.Query;

public class HospitalDao {

	public void displaySpecificData() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Hospital.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "from Hospital where id=:id";
		
		
		/*  Using query of org.hibernate
		 * Query<Hospital> query= ss.createQuery(hqlQuery, Hospital.class);
		 * query.setParameter("id", 1); 
		 * Hospital h=query.uniqueResult();
		 * System.out.println(h);
		 */
		
		/*
		 * Using query jakarta.persistance
		 */
		Query query= ss.createQuery(hqlQuery, Hospital.class);
		query.setParameter("id", 2);
		Hospital h= (Hospital) query.getSingleResult();
		System.out.println(h);

		tr.commit();
		ss.close();
	}

}
