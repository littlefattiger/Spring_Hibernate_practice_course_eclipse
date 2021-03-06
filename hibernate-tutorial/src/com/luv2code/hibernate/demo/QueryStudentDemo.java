package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory  =new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session =factory.getCurrentSession();
		
		try {
			session.beginTransaction();

			List<Student> theStudents = session.createQuery("from Student").getResultList();
			displayStudent(theStudents);
			session.getTransaction().commit();

			System.out.println("Done");

		}
	
		finally {
			factory.close();
		}
		
	}

	private static void displayStudent(List<Student> theStudents) {
		for(Student tempStudent:theStudents) {
			System.out.println(tempStudent);
		}
	}

}
