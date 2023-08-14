package com.techlabs.decorator;

public class PremiumHat implements IHat{

	@Override
	public String getName() {
		return "Premium Hat";
	}

	@Override
	public int getPrice() {
		return 200;
	}

	@Override
	public String getDescription() {
		return "This is a premium Hat";
	}

}
