package com.sky.abstractfactorypattern;

/**
 * 抽象工厂
 * @author 12874
 *
 */
public abstract class AbstractFactory {
	/**
	 * 创建电脑
	 * @param type
	 * 
	 */
	abstract Computer createComputer(String type);
	
	/**
	 * 指定电脑价格
	 * @param currency
	 * 
	 */
	abstract Price createPrice(String currency);
}
