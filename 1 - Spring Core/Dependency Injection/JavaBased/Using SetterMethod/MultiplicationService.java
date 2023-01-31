package com.ncu.CalculatorAppT;

public class MultiplicationService implements MathService {
	public void operate(int x, int y) {
		System.out.println(x*y);
	}
}
