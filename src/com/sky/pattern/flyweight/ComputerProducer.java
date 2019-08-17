package com.sky.pattern.flyweight;

/**
 * 电脑制造类
 * @author 12874
 *
 */
public class ComputerProducer implements Computer {

	private String brand;
	
	public ComputerProducer(String brand) {
		this.brand = brand;
	}
	
	@Override
	public void make() {
		System.out.println("produce a " + brand + "Computer");
	}

	
}
