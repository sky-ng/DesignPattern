package com.sky.pattern.state;

public class Rain implements State {

	@Override
	public String getState() {
		return "今天的天气：下雨";
	}

}
