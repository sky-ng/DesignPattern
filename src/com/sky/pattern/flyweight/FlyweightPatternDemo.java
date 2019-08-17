package com.sky.pattern.flyweight;

/**
 * 享元模式测试类
 * @author 12874
 *
 */
public class FlyweightPatternDemo {
	
	static String brands[] = {"ASUS", "Lenovo", "MacBook"};

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			Computer computer = ComputerFactory.getComputer(getRandomBrand());
			computer.make();
		}
	}
	
	private static String getRandomBrand() {
		return brands[(int) (Math.random() * brands.length)];
	}
}
