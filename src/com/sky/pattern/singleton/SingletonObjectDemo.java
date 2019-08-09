package com.sky.pattern.singleton;

/**
 * 单例测试类
 * @author 12874
 *
 */
public class SingletonObjectDemo {
	public static void main(String[] args) {
		SingletonObject object = SingletonObject.getInstance();
		object.showMessage();
	}
}
