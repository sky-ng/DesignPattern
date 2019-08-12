package com.sky.pattern.bridge;

/**
 * 桥接
 * @author 12874
 *
 */
public abstract class Bridge {
	protected Computer computer;

	public Bridge(Computer computer) {
		this.computer = computer;
	}
	
	public abstract void makeComputer();
}
