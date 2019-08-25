package com.sky.pattern.interpreter;

/**
 * 数值解释器
 * @author 12874
 *
 */
public class NumericalExpression implements Expression {
	
	private int value1;
	private int value2;

	public NumericalExpression(int value1, int value2) {
		this.value1 = value1;
		this.value2 = value2;
	}

	@Override
	public boolean interpret() {
		return (value1 - value2) > 0;
	}
	
}
