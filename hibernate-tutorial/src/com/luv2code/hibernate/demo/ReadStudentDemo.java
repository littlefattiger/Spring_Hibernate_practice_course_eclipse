package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory  =new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session =factory.getCurrentSession();
		
		try {
			System.out.println("Creating new student Object");
			Student tempStudent =new Student("Daffy", "Duck","Apple@apple2.com");
			session.beginTransaction();
			System.out.println("Saving students");
			session.save(tempStudent);
			session.getTransaction().commit();
			System.out.println("Saving students Done!!! test1");
			System.out.println("Saving student. GenerateId:" + tempStudent.getId());

			System.out.println("Getting Items");
			session =factory.getCurrentSession();
			session.beginTransaction();

			System.out.println("Getting student With ID: " +tempStudent.getId() );
			Student myStudent = session.get(Student.class, tempStudent.getId());
			System.out.println("Getting Complete: " + myStudent.getId());
			session.getTransaction().commit();

			System.out.println("Done");



		}
	
		finally {
			factory.close();
		}
		
	}

}
