package com.sky.pattern.template;

/**
 * 超级玛丽
 * @author SKY
 *
 */
public class SuperMarie extends Game {

	@Override
	void init() {
		System.out.println("Init SuperMarie Game");
	}

	@Override
	void start() {
		System.out.println("Start SuperMarie Game");
	}

	@Override
	void pause() {
		System.out.println("Pause SuperMarie Game");
	}

	@Override
	void end() {
		System.out.println("End SuperMarie Game");
	}

}
