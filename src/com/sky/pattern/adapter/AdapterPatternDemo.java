package com.sky.pattern.adapter;

/**
 * 适配器模式测试类
 * @author 12874
 *
 */
public class AdapterPatternDemo {
	public static void main(String[] args) {
		AudioPlay audioPlay = new AudioPlay();
		audioPlay.play("MP3");
		audioPlay.play("MP4");
		audioPlay.play("RMVB");
	}
}
