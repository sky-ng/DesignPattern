package com.sky.pattern.adapter;

/**
 * MP4格式播放器
 * @author 12874
 *
 */
public class Mp4Play implements AdvancedPlayer {

	@Override
	public void playMp4() {
		System.out.println("播放MP4格式的文件");
	}

	@Override
	public void playRMVB() {
		
	}

}
