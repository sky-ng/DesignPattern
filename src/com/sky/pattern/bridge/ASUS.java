package com.sky.pattern.bridge;

/**
 * 华硕类
 * @author 12874
 *
 */
public class ASUS implements Computer {
	
	@Override
	public void make() {
		System.out.println("produce a ASUS computer");
	}
	
}
