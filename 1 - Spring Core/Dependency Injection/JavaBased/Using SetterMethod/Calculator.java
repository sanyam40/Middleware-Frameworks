package com.ncu.CalculatorAppT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class Calculator {
	
	//public MathService Add, Sub, Multiply, Divide;
	
	MathService Add;
	MathService Sub;
	MathService Multiply;
	MathService Divide;
	
	
	/*
	 * @Autowired public Calculator(@Qualifier("additionService") MathService
	 * Add, @Qualifier("subtractionService") MathService
	 * Sub, @Qualifier("multiplicationService") MathService
	 * Multiply, @Qualifier("divisionService") MathService Divide) { this.Add = Add;
	 * this.Sub = Sub; this.Multiply = Multiply; this.Divide = Divide; }
	 */
	 
	
	
	  @Autowired
	  @Qualifier ("Add") void setAdditionService(MathService Add) {
		  this.Add=Add; 
	  }
	  
	  
	  @Autowired
	  @Qualifier ("Sub") void setSubtractionService(MathService Sub) { 
		  this.Sub=Sub; 
	  }
	  
	  
	  @Autowired
	  @Qualifier ("Multiply") void setMultiplicationService(MathService Multiply) { 
		  this.Multiply=Multiply; 
		  }
	  
	  
	  @Autowired
	  @Qualifier("Divide") void setDivisionService(MathService Divide) { 
		  this.Divide=Divide; 
		  }
	 
	
	
	public void compute(int x, int y, String Op) {
		if(Op=="Add") {
			 this.Add.operate(x, y);
		}
		
		else if (Op=="Subtract") {
			this.Sub.operate(x, y);
		}
		
		else if (Op=="Multiply") {
			this.Multiply.operate(x, y);	
		}
		
		else if (Op=="Devide") {
			this.Divide.operate(x, y);	
		}
		
		
		else {
			throw new RuntimeException ("SORRY, "+Op+" function not found. Enter 'Add', 'Subtract', 'Mutiply' or 'Divide' ");
		
		}	

	}
}
