package com.sky.pattern.Null;

public class NullObject implements AbstractObject {
	
	private String name;

	public NullObject(String name) {
		this.name = name;
	}

	@Override
	public boolean isNull() {
		return true;
	}

	@Override
	public void show() {
		System.out.println(name + " Object not exist");
	}

}
