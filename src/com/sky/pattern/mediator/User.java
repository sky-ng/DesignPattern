package com.sky.pattern.mediator;

public class User {
	private String name;

	public User(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void sendMessage(String message) {
		BBS.showMessage(this, message);
	}
}
