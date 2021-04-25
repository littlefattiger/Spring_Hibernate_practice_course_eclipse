package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory  =new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session =factory.getCurrentSession();
		
		try {
			System.out.println("Creating new student Object");
			Student tempStudent =new Student("Paul", "Allen","Apple@apple2.com");
			session.beginTransaction();
			System.out.println("Saving students");
			session.save(tempStudent);
			session.getTransaction().commit();
			System.out.println("Saving students Done!!!");

		}
	
		finally {
			factory.close();
		}
		
	}

}
