package com.sky.pattern.strategy;

public class Multiplication implements Strategy {

	@Override
	public int execute(int num1, int num2) {
		return num1 * num2;
	}

}
