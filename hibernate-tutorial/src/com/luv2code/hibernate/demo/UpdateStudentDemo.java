package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory  =new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session =factory.getCurrentSession();
		
		try {
			int studentid = 1;
			session =factory.getCurrentSession();
			session.beginTransaction();
			 

			System.out.println("Getting student With ID: " + studentid );
			Student myStudent = session.get(Student.class, studentid);

			myStudent.setFirstName("Apple");
			session.getTransaction().commit();

			System.out.println("Done");

			session =factory.getCurrentSession();
			session.beginTransaction();
			System.out.println("Updating");

			session.createQuery("update Student set email ='apple2.com'").executeUpdate();
			session.getTransaction().commit();
			


		}
	
		finally {
			factory.close();
		}
		
	}

}
