package com.ncu.Calculator;

public class CalculatorClass{
	
	public MathService Add, Sub, Multiply, Divide;
	
	public CalculatorClass(AdditionService Add, SubtractionService Sub, MultiplicationService Multiply, DivisionService Divide) {
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
