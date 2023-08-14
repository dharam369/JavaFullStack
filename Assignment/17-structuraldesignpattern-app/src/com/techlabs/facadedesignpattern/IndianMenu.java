package com.techlabs.facadedesignpattern;

public class IndianMenu implements IMenu{

	@Override
	public void displayMenu() {
		System.out.println("Garma Garam Chai");
		System.out.println("Khasta Karari Mungfali");
		System.out.println("Samose Aur Chatni");
		System.out.println("Panipuri");
		System.out.println("Thandi Mast Lassi");
	}

}
