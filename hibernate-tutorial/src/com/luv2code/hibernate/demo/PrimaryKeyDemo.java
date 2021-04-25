package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory  =new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session =factory.getCurrentSession();
		
		try {
			System.out.println("Creating 3 student Object");
			Student tempStudent1 =new Student("Paul1", "Allen1","Apple@apple3.com");
			Student tempStudent2 =new Student("Paul2", "Allen2","Apple@apple4.com");

			Student tempStudent3 =new Student("Paul3", "Allen3","Apple@apple5.com");

			session.beginTransaction();
			System.out.println("Saving students");
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);

			
			session.getTransaction().commit();
			System.out.println("Saving students Done!!!");

		}
	
		finally {
			factory.close();
		}
	}

}
