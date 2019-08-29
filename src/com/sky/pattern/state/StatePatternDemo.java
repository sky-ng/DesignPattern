package com.sky.pattern.state;

/**
 * 状态模式测试类
 * @author SKY
 *状态模式思想：类的行为是基于状态改变的，可以创建表示各种状态的对象和一个行为随着状态对象而改变的Context对象
 */
public class StatePatternDemo {

	public static void main(String[] args) {
		Weather weather = new Weather();
		weather.setState(new Rain());
		System.out.println(weather.getWeather());
		weather.setState(new Sunshine());
		System.out.println(weather.getWeather());
	}
}
