package com.sky.pattern.mediator;

/**
 * 中介者模式测试类
 * @author 12874
 *
 */
public class MediatorPatternDemo {
	public static void main(String[] args) {
		User robert = new User("Tom");
		User john = new User("John");
		robert.sendMessage("Headline : celestial dog devouring the sun !");
		john.sendMessage("Reply : no, it is Solar Eclipse ~");
	}
}
