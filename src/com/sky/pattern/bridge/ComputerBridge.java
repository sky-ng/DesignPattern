package com.sky.pattern.bridge;

public class ComputerBridge extends Bridge {

	public ComputerBridge(Computer computer) {
		super(computer);
	}

	@Override
	public void makeComputer() {
		computer.make();
	}

}
