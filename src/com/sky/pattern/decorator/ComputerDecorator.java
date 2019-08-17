package com.sky.pattern.decorator;

public abstract class ComputerDecorator implements Computer {
	Computer computer;

	public ComputerDecorator(Computer computer) {
		this.computer = computer;
	}
	
	public void make() {
		computer.make();
	}
}
