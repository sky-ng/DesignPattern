package com.sky.pattern.bridge;

/**
 * 桥接模式测试类
 * @author 12874
 *
 */
public class BridgePatternDemo {
	public static void main(String[] args) {
		ComputerBridge asus = new ComputerBridge(new ASUS());
		asus.makeComputer();
		
		ComputerBridge lenovo = new ComputerBridge(new Lenovo());
		lenovo.makeComputer();
		
		ComputerBridge macBook = new ComputerBridge(new MacBook());
		macBook.makeComputer();
	}
}
