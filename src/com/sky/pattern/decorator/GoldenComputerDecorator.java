package com.sky.pattern.decorator;

/**
 * 金色电脑装饰器
 * @author 12874
 *
 */
public class GoldenComputerDecorator extends ComputerDecorator {

	public GoldenComputerDecorator(Computer computer) {
		super(computer);
	}
	
	@Override
	public void make() {
		super.make();
		paintColor();
	}

	private void paintColor() {
		System.out.println("给电脑涂上金色");
	}

}
