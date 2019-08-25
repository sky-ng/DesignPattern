package com.sky.pattern.command;

/**
 * 命令模式测试类
 * @author 12874
 *
 */
public class CommandPatternDemo {
	public static void main(String[] args) {
		Soldier soldier = new Soldier();
		AttentionCommand attentionCommand = new AttentionCommand(soldier);
		StandEaseCommand standEaseCommand = new StandEaseCommand(soldier);
		Broker broker = new Broker();
		broker.addCommand(attentionCommand);
		broker.addCommand(standEaseCommand);
		broker.executeCommand();
	}
}
