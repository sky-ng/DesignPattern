package com.sky.pattern.prototype;

public abstract class Computer implements Cloneable {
	
	protected String type;
	
	/**
	 * 制造电脑的方法
	 */
	public void make() {
		
	}
	
	/**
	 * 克隆方法
	 */
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}

}
