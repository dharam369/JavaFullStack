package com.techlabs.facadedesignpattern;

public class ChineseHotel implements IHotel{
	@Override
	public IMenu getMenu() {
		return new ChineseMenu();
	}
}
