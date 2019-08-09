package com.sky.pattern.builder;

/**
 * 电脑配件实现类显示器
 * @author 12874
 *
 */
public abstract class Screen implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}
	
}
