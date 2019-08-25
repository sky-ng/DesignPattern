package com.sky.pattern.interpreter;

/**
 * 或表达式解释器
 * @author 12874
 *
 */
public class OrExpression implements Expression {
	
	private Expression expression1 = null;
	private Expression expression2 = null;
	
	public OrExpression(Expression expression1, Expression expression2) {
		this.expression1 = expression1;
		this.expression2 = expression2;
	}

	@Override
	public boolean interpret() {
		return expression1.interpret() || expression2.interpret();
	}

}
