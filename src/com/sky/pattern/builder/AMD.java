package com.sky.pattern.builder;

/**
 * AMD处理器
 * @author 12874
 *
 */
public class AMD extends CPU {

	@Override
	public String name() {
		return "AMD处理器";
	}

	@Override
	public int price() {
		return 2000;
	}

}
