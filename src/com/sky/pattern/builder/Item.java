package com.sky.pattern.builder;
/**
 * 电脑配件接口
 * @author 12874
 *
 */
public interface Item {
	
	String name();
	
	Packing packing();
	
	int price();
}
