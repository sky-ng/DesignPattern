package com.sky.pattern.memento;

/**
 * 备忘录模式测试类
 * @author 12874
 * 备忘录模式思想：用于保存一个对象的状态，以便在适当的时候恢复对象
 */
public class MementoPatternDemo {
	public static void main(String[] args) {
		Original original = new Original();
		StateKeeper keeper = new StateKeeper();
		original.setState("State 1");
		keeper.addState(original.saveMementoState());
		
		//状态变更
		original.setState("State 2");
		keeper.addState(original.saveMementoState());
		
		//状态变更
		original.setState("State 3");
		System.out.println("Current State is :" + original.getState());
		
		//第一次保存的状态
		original.getMementoState(keeper.get(0));
		System.out.println("Initial State: " + original.getState());
		
		//第二次保存的状态
		original.getMementoState(keeper.get(1));
		System.out.println("Second State: " + original.getState());
	}
}
