package com.sky.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令的调用类
 * @author 12874
 *
 */
public class Broker {
	private List<Command> commandList = new ArrayList<>();
	
	/**
	 * 添加命令
	 * @param command
	 */
	public void addCommand(Command command) {
		commandList.add(command);
	}
	
	/**
	 * 执行命令
	 */
	public void executeCommand() {
		for (Command command : commandList) {
			command.doCommand();
		}
	}
}
