package com.sky.pattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 状态管理类
 * @author 12874
 *
 */
public class StateKeeper {
	private List<Memento> mementoList = new ArrayList<>();
	
	public void addState(Memento state) {
		mementoList.add(state);
	}
	
	public Memento get(int index) {
		return mementoList.get(index);
	}
}
