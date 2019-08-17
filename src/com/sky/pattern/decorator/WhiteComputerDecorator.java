package com.sky.pattern.decorator;

/**
 * 白色电脑装饰器
 * @author 12874
 *
 */
public class WhiteComputerDecorator extends ComputerDecorator {

	public WhiteComputerDecorator(Computer computer) {
		super(computer);
	}

	@Override
	public void make() {
		super.make();
		paintColor();
	}

	private void paintColor() {
		System.out.println("给电脑涂上白色");
	}
}
