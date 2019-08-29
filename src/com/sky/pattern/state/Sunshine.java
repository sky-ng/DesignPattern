package com.sky.pattern.state;

public class Sunshine implements State {

	@Override
	public String getState() {
		return "今天的天气：晴天";
	}

}
