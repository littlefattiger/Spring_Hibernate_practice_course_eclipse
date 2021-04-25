package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Student;

public class CreateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory  =new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		Session session =factory.getCurrentSession();
		
		try {
			System.out.println("Begin loading");
			Instructor tempInstructor = new Instructor("Chad","Darby","darlly@luv2.com");
			InstructorDetail tempInstructorDetail = new InstructorDetail("http.apple.com","lovetcode");
			
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			session.beginTransaction();

			session.save(tempInstructor);
			
			session.getTransaction().commit();
			System.out.println("Saving students Done!!!");

		}
	
		finally {
			factory.close();
		}
		
	}

}
