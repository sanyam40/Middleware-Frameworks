package com.spring.EndTermEvaluation.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class rollnoConstraintValidator implements ConstraintValidator<rollno,String>{
	
	private String rollnoprefix;

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		boolean result=value.startsWith(rollnoprefix);
		return result;
	}
	
	@Override
	public void initialize(rollno constraintAnnotation) {
		// TODO Auto-generated method stub
		/* ConstraintValidator.super.initialize(constraintAnnotation); */
		rollnoprefix = constraintAnnotation.value();
	}

}
