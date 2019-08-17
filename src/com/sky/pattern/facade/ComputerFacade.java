package com.sky.pattern.facade;

/**
 * 电脑门面
 * @author 12874
 *
 */
public class ComputerFacade {
	private Computer lenovo;
	
	private Computer asus;
	
	private Computer macBook;

	public ComputerFacade() {
		lenovo = new Lenovo();
		asus = new ASUS();
		macBook = new MacBook();
	}
	
	public void makeLenovo() {
		lenovo.make();
	}
	
	public void makeASUS() {
		asus.make();
	}
	
	public void makeMacBook() {
		macBook.make();
	}
}
