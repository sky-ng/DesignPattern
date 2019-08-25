package com.sky.pattern.command;

/**
 * 立正命令
 * @author 12874
 *
 */
public class AttentionCommand implements Command {
	
	private Soldier soldier;

	public AttentionCommand(Soldier soldier) {
		this.soldier = soldier;
	}

	@Override
	public void doCommand() {
		soldier.attention();
	}

}
