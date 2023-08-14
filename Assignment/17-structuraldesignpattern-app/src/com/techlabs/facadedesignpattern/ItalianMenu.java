package com.techlabs.facadedesignpattern;

public class ItalianMenu implements IMenu{

	@Override
	public void displayMenu() {
		System.out.println("French Fries");
		System.out.println("Chaumin");
		System.out.println("Cold Cofee");
		System.out.println("Pizza");
	}

}
