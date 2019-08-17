package com.sky.pattern.facade;

/**
 * 外观模式测试类
 * @author 12874
 *
 */
public class FacadePatternDemo {

	public static void main(String[] args) {
		ComputerFacade computerFacade = new ComputerFacade();
		computerFacade.makeLenovo();
		computerFacade.makeASUS();
		computerFacade.makeMacBook();
	}
}
