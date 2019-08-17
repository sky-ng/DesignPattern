package com.sky.pattern.decorator;

/**
 * 红色电脑装饰器
 * @author 12874
 *
 */
public class RedComputerDecorator extends ComputerDecorator {

	public RedComputerDecorator(Computer computer) {
		super(computer);
	}

	@Override
	public void make() {
		super.make();
		paintColor();
	}



	private void paintColor() {
		System.out.println("给电脑涂上红色");
	}
}
