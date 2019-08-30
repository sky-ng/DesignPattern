package com.sky.pattern.strategy;

/**
 * 策略模式测试类
 * @author SKY
 *
 */
public interface StrategyPatternDemo {
	public static void main(String[] args) {
		Context context = new Context(new Addition());
		System.out.println("10 + 20 = " + context.execute(10, 20));
		context = new Context(new Subtraction());
		System.out.println("10 - 20 = " + context.execute(10, 20));
		context = new Context(new Multiplication());
		System.out.println("10 * 20 = " + context.execute(10, 20));
	}
}
