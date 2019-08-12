package com.sky.pattern.bridge;

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
