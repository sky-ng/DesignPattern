package com.sky.pattern.adapter;

/**
 * 音频播放器
 * @author 12874
 *
 */
public class AudioPlay implements Player {
	
	PlayerAdapter playerAdapter;

	@Override
	public void play(String type) {
		if ("MP3".equals(type)) {
			System.out.println("播放MP3格式的文件");
		} else if ("MP4".equals(type) || "RMVB".equals(type)) {
			playerAdapter = new PlayerAdapter(type);
			playerAdapter.play(type);
		}
	}

}
