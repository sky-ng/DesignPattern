package com.sky.pattern.builder;

/**
 * PHILIPS显示器
 * @author 12874
 *
 */
public class PHILIPS extends Screen {

	@Override
	public String name() {
		return "PHILIPS显示器";
	}

	@Override
	public int price() {
		return 1000;
	}

}
