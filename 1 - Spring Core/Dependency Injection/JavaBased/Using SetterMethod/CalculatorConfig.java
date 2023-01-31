// DATE : 31/01/23

package com.ncu.CalculatorAppT;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalculatorConfig {
	
	@Bean
	Calculator calc() {
		Calculator Operation = new Calculator();
		Operation.setAdditionService(Add());
		Operation.setSubtractionService(Sub());
		Operation.setMultiplicationService(Multiply());
		Operation.setDivisionService(Divide());
		return Operation;
	}
	
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
