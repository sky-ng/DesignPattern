package com.sky.pattern.bridge;

/**
 * MacBook类
 * @author 12874
 *
 */
public class MacBook implements Computer {

	@Override
	public void make() {
		System.out.println("produce a MacBook computer");
	}

}
