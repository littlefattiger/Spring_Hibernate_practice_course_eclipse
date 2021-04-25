package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory  =new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session =factory.getCurrentSession();
		
		try {
//			int studentid = 1;
//			session =factory.getCurrentSession();
//			session.beginTransaction();
//			 
//
//			System.out.println("Getting student With ID: " + studentid );
//			Student myStudent = session.get(Student.class, studentid);
//			System.out.println("Deleting " + myStudent);
//
//			session.delete(myStudent);
//			session.getTransaction().commit();
			
			session =factory.getCurrentSession();
			session.beginTransaction();
			session.createQuery("delete Student where id =3").executeUpdate();
			session.getTransaction().commit();

			System.out.println("Done");


			


		}
	
		finally {
			factory.close();
		}
		
	}

}
