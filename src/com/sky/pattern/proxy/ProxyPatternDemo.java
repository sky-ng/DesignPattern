package com.sky.pattern.proxy;

/**
 * 代理模式测试类
 * @author 12874
 *
 */
public class ProxyPatternDemo {
	public static void main(String[] args) {
		CustomerProxy customerProxy = new CustomerProxy(new Customer());
		customerProxy.buy();
	}
}
