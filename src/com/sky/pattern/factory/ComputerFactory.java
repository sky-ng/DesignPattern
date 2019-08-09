package com.sky.pattern.factory;

/**
 * 电脑工厂
 * @author 12874
 *
 */
public class ComputerFactory {
	
	public Computer createComputer(String type) {
		if (type == null || type.equals("")) {
			return null;
		}
		switch (type) {
		case "ASUS":
			return new ASUS();
		case "Lenovo":
			return new Lenovo();
		case "MacBook":
			return new MacBook();
		default:
			return null;
		}
	}
}
