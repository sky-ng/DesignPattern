package com.sky.pattern.abstractfactory;

public class PriceFactory extends AbstractFactory {

	@Override
	public Computer createComputer(String type) {
		return null;
	}

	@Override
	public Price createPrice(String currency) {
		if (currency == null || currency.equals("")) {
			return null;
		}
		switch (currency) {
		case "RMB":
			return new RMB();
		case "Pound":
			return new Pound();
		case "Dollar":
			return new Dollar();
		default:
			return null;
		}
	}

}
