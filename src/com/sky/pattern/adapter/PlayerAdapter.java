package com.sky.pattern.adapter;

public class PlayerAdapter implements Player {
	
	private AdvancedPlayer advancedPlayer;
	
	public PlayerAdapter(String type) {
		if ("MP4".equals(type)) {
			advancedPlayer = new Mp4Play();
		} else if ("RMVB".equals(type)) {
			advancedPlayer = new RmvbPlay();
		}
	}



	@Override
	public void play(String type) {
		if ("MP4".equals(type)) {
			advancedPlayer.playMp4();
		} else if ("RMVB".equals(type)) {
			advancedPlayer.playRMVB();
		}
	}

}
