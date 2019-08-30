package com.sky.pattern.template;

/**
 * 模板模式测试类
 * @author SKY
 *
 */
public class TemplatePatternDemo {
	public static void main(String[] args) {
		Game tetris = new Tetris();
		tetris.play();
		System.out.println("-------------------分割线--------------------");
		Game superMarie = new SuperMarie();
		superMarie.play();
	}
}
