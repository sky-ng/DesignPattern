package com.sky.pattern.template;

/**
 * 游戏类
 * @author SKY
 *
 */
public abstract class Game {
	abstract void init();
	abstract void start();
	abstract void pause();
	abstract void end();
	
	void play() {
		init();
		start();
		pause();
		end();
	}
}
