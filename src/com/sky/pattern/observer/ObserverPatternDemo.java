package com.sky.pattern.observer;

/**
 * 观察者模式测试类
 * @author 12874
 *
 */
public class ObserverPatternDemo {
	public static void main(String[] args) {
		WeChatPublic weChatPublic = new WeChatPublic();
		WeChatUser weChatUser1 = new WeChatUser("Jack");
		WeChatUser weChatUser2 = new WeChatUser("Tom");
		WeChatUser weChatUser3 = new WeChatUser("John");
		
		weChatPublic.addObserver(weChatUser1);
		weChatPublic.addObserver(weChatUser2);
		weChatPublic.addObserver(weChatUser3);
		
		weChatPublic.setMessage("Hello World");
	}
}
