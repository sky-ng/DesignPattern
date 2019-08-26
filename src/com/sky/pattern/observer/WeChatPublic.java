package com.sky.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 微信公众号
 * @author 12874
 *
 */
public class WeChatPublic {
	
	//观察者列表
	private List<Observer> observerList;
	
	private String message;
	
	public WeChatPublic() {
		observerList = new ArrayList<>();
	}
	
	public void setMessage(String message) {
		this.message = message;
		System.out.println("微信公众号更新消息：" + message);
		notifyObserverList();
	}
	
	public void addObserver(Observer observer) {
		observerList.add(observer);
	}
	
	public void notifyObserverList() {
		for (Observer observer : observerList) {
			observer.listen(message);
		}
	}
}
