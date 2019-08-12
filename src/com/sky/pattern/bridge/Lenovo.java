package com.sky.pattern.bridge;

/**
 * 联想类
 * @author 12874
 *
 */
public class Lenovo implements Computer {
	
	@Override
	public void make() {
		System.out.println("produce a Lenovo computer");
	}
}
