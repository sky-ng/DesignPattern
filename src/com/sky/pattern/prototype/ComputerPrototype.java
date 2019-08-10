package com.sky.pattern.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * 电脑原型类
 * @author 12874
 *
 */
public class ComputerPrototype {
	private static Map<String, Computer> computerMap = new HashMap<>();
	
	static {
		computerMap.put("ASUS", new ASUS());
		computerMap.put("Lenovo", new Lenovo());
		computerMap.put("MacBook", new MacBook());
	}
	
	public static Computer getComputer(String type) {
		Computer computer = computerMap.get(type);
		if (computer != null) {
			//返回克隆对象
			return (Computer) computer.clone();
		}
		return null;
	}
}
