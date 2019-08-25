package com.sky.pattern.command;

/**
 * 稍息命令
 * @author 12874
 *
 */
public class StandEaseCommand implements Command {
	
	private Soldier soldier;

	public StandEaseCommand(Soldier soldier) {
		this.soldier = soldier;
	}

	@Override
	public void doCommand() {
		soldier.standAtEase();
	}

}
