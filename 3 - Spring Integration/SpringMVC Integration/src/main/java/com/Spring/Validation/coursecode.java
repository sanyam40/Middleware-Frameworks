package com.Spring.Validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=coursecodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface coursecode {
	
public String value()default "CSL";
	
	public String message()default"must start with CSL";
	
	public Class<?>[] groups() default{};
	  
	  public Class<? extends Payload>[] payload() default{};

}
