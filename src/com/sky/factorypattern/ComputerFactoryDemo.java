package com.sky.factorypattern;

/**
 * 工厂模式测试类
 * @author 12874
 *
 */
public class ComputerFactoryDemo {
	public static void main(String[] args) {
		ComputerFactory computerFactory = new ComputerFactory();
		Computer asus = computerFactory.createComputer("ASUS");
		asus.make();
		Computer lenovo = computerFactory.createComputer("Lenovo");
		lenovo.make();
		Computer macBook = computerFactory.createComputer("MacBook");
		macBook.make();
	}
}
