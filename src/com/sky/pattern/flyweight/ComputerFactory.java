package com.sky.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 电脑工厂
 * @author 12874
 *
 */
public class ComputerFactory {
	private static final Map<String, Computer> computerMap = new HashMap<>();
	
	public static Computer getComputer(String brand) {
		Computer computer = computerMap.get(brand);
		if (computer == null) {
			computer = new ComputerProducer(brand);
			computerMap.put(brand, computer);
		}
		return computer;
	}
}
