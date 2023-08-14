package com.techlabs.facadedesignpattern;

public class ChineseMenu implements IMenu{
	@Override
	public void displayMenu() {
		System.out.println("Soup");
		System.out.println("Chaumin");
		System.out.println("Magi Masala");
	}
}
