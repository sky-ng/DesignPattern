package com.sky.pattern.facade;

public class FacadePatternDemo {

	public static void main(String[] args) {
		ComputerFacade computerFacade = new ComputerFacade();
		computerFacade.makeLenovo();
		computerFacade.makeASUS();
		computerFacade.makeMacBook();
	}
}
