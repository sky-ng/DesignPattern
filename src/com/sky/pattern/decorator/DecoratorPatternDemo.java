package com.sky.pattern.decorator;

/**
 * 装饰器模式测试类
 * @author 12874
 *
 */
public class DecoratorPatternDemo {
	public static void main(String[] args) {
		Computer whiteComputer = new WhiteComputerDecorator(new ASUS());
		whiteComputer.make();
		Computer goldenComputer = new GoldenComputerDecorator(new Lenovo());
		goldenComputer.make();
		Computer redComputer = new RedComputerDecorator(new MacBook());
		redComputer.make();
	}
}
