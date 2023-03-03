package com.Spring.Validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class coursecodeConstraintValidator implements ConstraintValidator<coursecode,String>{
	
	private String coursecodeprefix;

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		boolean result=value.startsWith(coursecodeprefix);
		return result;
	}
	
	@Override
	public void initialize(coursecode constraintAnnotation) {
		// TODO Auto-generated method stub
		/* ConstraintValidator.super.initialize(constraintAnnotation); */
		coursecodeprefix = constraintAnnotation.value();
	}

}
