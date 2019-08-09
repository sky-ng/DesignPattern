package com.sky.pattern.builder;

/**
 * 电脑配件实现类CPU
 * @author 12874
 *
 */
public abstract class CPU implements Item {

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}

}
