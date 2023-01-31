package com.ncu.Calculator;

public class AdditionService implements MathService{

	@Override
	public void operate(int x, int y) {
		System.out.println(x+y);
	}
}
