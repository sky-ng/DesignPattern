package com.sky.pattern.builder;

/**
 * Intel处理器
 * @author 12874
 *
 */
public class Intel extends CPU {

	@Override
	public String name() {
		return "Intel处理器";
	}

	@Override
	public int price() {
		return 3000;
	}

}
