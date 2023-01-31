// DATE : 31/01/23
// SANYAM 21CSU234

package com.ncu.Calculator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalculatorConfig {
	// Dependent Class
	
	@Bean
	CalculatorClass calc() {
		return new CalculatorClass(Add(),Sub(),Multiply(),Divide());
	}
	
	// Dependencies
	
	@Bean
	MathService Add() {
		return new AdditionService();
	}
	
	@Bean
	MathService Sub() {
		return new SubtractionService();
	}
	
	@Bean
	MathService Multiply() {
		return new MultiplicationService();
	}
	
	@Bean 
	MathService Divide() {
		return new DivisionService();
	}
}
