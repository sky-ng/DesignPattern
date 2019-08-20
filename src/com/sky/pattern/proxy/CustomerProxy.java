package com.sky.pattern.proxy;

/**
 * 客户代理
 * @author 12874
 *
 */
public class CustomerProxy implements BuyHouse {
	
	private Customer customer;

	public CustomerProxy(Customer customer) {
		this.customer = customer;
	}

	@Override
	public void buy() {
		customer.buy();
	}

}
