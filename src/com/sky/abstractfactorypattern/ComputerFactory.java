package com.sky.abstractfactorypattern;

/**
 * 电脑工厂
 * @author 12874
 *
 */
public class ComputerFactory extends AbstractFactory {

	@Override
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

	@Override
	public Price createPrice(String currency) {
		return null;
	}
	
}
