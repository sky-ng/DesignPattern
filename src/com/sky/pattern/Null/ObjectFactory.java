package com.sky.pattern.Null;

/**
 * 对象工厂
 * @author SKY
 *
 */
public class ObjectFactory {
	public static final String[] names = {"table", "light", "bed"};
	
	public static AbstractObject getObject(String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i].equalsIgnoreCase(name)) {
				return new RealObject(name);
			} else {
				return new NullObject(name);
			}
		}
		return new NullObject("");
	}
}
