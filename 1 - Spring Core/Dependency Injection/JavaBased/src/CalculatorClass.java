package com.ncu.Calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.ncu.CalculatorAppT.MathService;

public class CalculatorClass{
	
	MathService Add;
	MathService Sub;
	MathService Multiply;
	MathService Divide;
	
	
	@Autowired
	public CalculatorClass(@Qualifier("additionService") MathService Add, @Qualifier("subtractionService") MathService Sub, @Qualifier("multiplicationService") MathService Multiply, @Qualifier("divisionService") MathService Divide) {
		this.Add = Add;
		this.Sub = Sub;
		this.Multiply = Multiply;
		this.Divide = Divide;
	}
	
	public void Compute(String Op, int x, int y) {
		if(Op=="Add") {
			 this.Add.operate(x, y);
		}
		
		else if (Op=="Subtract") {
			this.Sub.operate(x, y);
		}
		
		else if (Op=="Multiply") {
			this.Multiply.operate(x, y);	
		}
		
		else if (Op=="Divide") {
			this.Divide.operate(x, y);	
		}
		else {
			throw new RuntimeException ("SORRY, "+Op+" function not found. Enter 'Add', 'Subtract', 'Mutiply' or 'Divide' ");
		}	
	}
}
