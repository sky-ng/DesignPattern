package com.sky.pattern.proxy;

/**
 * 客户
 * @author 12874
 *
 */
public class Customer implements BuyHouse {

	@Override
	public void buy() {
		System.out.println("我是客户，我想买房");
	}
}
