package com.sky.pattern.adapter;

/**
 * RMVB格式播放器
 * @author 12874
 *
 */
public class RmvbPlay implements AdvancedPlayer {

	@Override
	public void playMp4() {

	}

	@Override
	public void playRMVB() {
		System.out.println("播放RMVB格式的文件");
	}

}
