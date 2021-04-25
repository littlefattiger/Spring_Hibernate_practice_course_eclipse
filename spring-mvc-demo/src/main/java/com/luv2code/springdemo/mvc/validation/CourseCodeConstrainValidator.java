package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstrainValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode constraintAnnotation) {
		// TODO Auto-generated method stub
		coursePrefix = constraintAnnotation.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		boolean result;
		if(theCode != null) {
			  result =theCode.startsWith(coursePrefix);

		}
		else {
			result = true;
		}
		
		
		return result;
	}

	
	
}
