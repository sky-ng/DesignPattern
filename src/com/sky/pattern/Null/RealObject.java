package com.sky.pattern.Null;

public class RealObject implements AbstractObject {

	private String name;
	
	public RealObject(String name) {
		this.name = name;
	}

	@Override
	public boolean isNull() {
		return false;
	}

	@Override
	public void show() {
		System.out.println("real object " + name + " shows now");
	}

}
