package com.techlabs.decorator;

public class StandardHat implements IHat{

	@Override
	public String getName() {
		return "Standard Hat";
	}

	@Override
	public int getPrice() {
		return 100;
	}

	@Override
	public String getDescription() {
		return "This is a Standard Hat";
	}

}
