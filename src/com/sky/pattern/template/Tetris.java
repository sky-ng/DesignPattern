package com.sky.pattern.template;

/**
 * 俄罗斯方块
 * @author SKY
 *
 */
public class Tetris extends Game {

	@Override
	void init() {
		System.out.println("Init Tetris Game");
	}

	@Override
	void start() {
		System.out.println("Start Tetris Game");
	}

	@Override
	void pause() {
		System.out.println("Pause Tetris Game");
	}

	@Override
	void end() {
		System.out.println("End Tetris Game");
	}

}
