package com.sky.pattern.prototype;

/**
 * 原型模式测试类
 * @author 12874
 *
 */
public class PrototypePatternDemo {

	public static void main(String[] args) {
		Computer asus = ComputerPrototype.getComputer("ASUS");
		asus.make();
		Computer lenovo = ComputerPrototype.getComputer("Lenovo");
		lenovo.make();
		Computer macBook = ComputerPrototype.getComputer("MacBook");
		macBook.make();
	}
}
