package com.sky.pattern.state;

public class Weather {

	private State state;

	public String getWeather() {
		return state.getState();
	}

	public void setState(State state) {
		this.state = state;
	}
	
}
