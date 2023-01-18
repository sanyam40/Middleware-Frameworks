package com.ncu.Calculator;

public class Calculator {
	public MathService Compute(String operation) {
		if(operation=="add") {
			return new AdditionService();
		}
		else if(operation=="sub") {
			return new DivisionService();
		}
        else if(operation=="mul") {
        	return new MultiplicationService();
		}
        else if(operation=="div") {
        	return new DivisionService();
		}
        else {
			throw new RuntimeException("Sorry, "+operation+" operation is not available!!");
		}
		
		
	}

	public MathService operate(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

}
