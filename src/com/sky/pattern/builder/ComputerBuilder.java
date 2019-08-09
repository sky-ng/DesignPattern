package com.sky.pattern.builder;

/**
 * 电脑建造者
 * @author 12874
 *
 */
public class ComputerBuilder {
	
	/**
	 * 创建廉价电脑
	 */
	public Computer buildCheap() {
		Computer computer = new Computer();
		computer.addItem(new AMD());
		computer.addItem(new PHILIPS());
		return computer;
	}
	
	/**
	 * 创建高价电脑
	 */
	public Computer buildExpensive() {
		Computer computer = new Computer();
		computer.addItem(new Intel());
		computer.addItem(new DELL());
		return computer;
	}
}
