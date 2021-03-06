package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	public void forDaoPackage() {
		
		System.out.println("=========================================yhis is AOP ====================");
	}
	
	
	@Before("forDaoPackage())")
	public void beforeAddAccountAdvice() {
		
		System.out.println("=========================================yhis is AOP ====================");
	}
}
