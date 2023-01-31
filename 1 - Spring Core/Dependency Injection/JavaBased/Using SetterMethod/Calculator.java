package com.ncu.CalculatorAppT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Calculator {
	
	MathService Add;
	MathService Sub;
	MathService Multiply;
	MathService Divide;
	
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
