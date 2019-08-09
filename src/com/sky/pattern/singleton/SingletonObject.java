package com.sky.pattern.singleton;

/**
 * 单例
 * @author 12874
 *
 */
public class SingletonObject {
	
	private static SingletonObject instance = new SingletonObject();
	
	//让构造函数为private，防止该类被实例化
	private SingletonObject() {
		
	}
	
	//获取唯一可用对象
	public static SingletonObject getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Hello World!");
	}
}
