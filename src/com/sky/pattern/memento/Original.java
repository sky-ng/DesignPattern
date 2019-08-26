package com.sky.pattern.memento;

/**
 * 原始类
 * @author 12874
 *
 */
public class Original {
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public Memento saveMementoState() {
		return new Memento(state);
	}
	
	public void getMementoState(Memento memento) {
		state = memento.getState();
	}
}
