package com.sky.abstractfactorypattern;

public class FactoryProducer {
	public static AbstractFactory getFactory(String factoryType) {
		if ("Computer".equals(factoryType)) {
			return new ComputerFactory();
		} else if ("Price".equals(factoryType)) {
			return new PriceFactory();
		}
		return null;
	}
}
