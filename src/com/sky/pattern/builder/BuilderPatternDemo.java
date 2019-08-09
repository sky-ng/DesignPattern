package com.sky.pattern.builder;

/**
 * 建造者模式测试类
 * @author 12874
 *
 */
public class BuilderPatternDemo {
	public static void main(String[] args) {
		ComputerBuilder computerBuilder = new ComputerBuilder();
		Computer cheapComputer = computerBuilder.buildCheap();
		cheapComputer.showItems();
		Computer expensiveComputer = computerBuilder.buildExpensive();
		expensiveComputer.showItems();
	}
}
