package com.Spring.Validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=rollnoConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface rollno {
	
	public String value()default "csu";
	
	public String message()default"must start with csu";
	
	public Class<?>[] groups() default{};
	  
	  public Class<? extends Payload>[] payload() default{};
}
