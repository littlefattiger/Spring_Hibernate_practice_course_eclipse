package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach thecoch =context.getBean("myCoach",Coach.class);
		Coach alphacoch =context.getBean("myCoach",Coach.class);
		boolean result = thecoch== alphacoch;
		
		System.out.println(result);
		
		System.out.println(thecoch);

		System.out.println(alphacoch);

		context.close();
	}

}
