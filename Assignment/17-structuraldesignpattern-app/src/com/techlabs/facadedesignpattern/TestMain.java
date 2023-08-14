package com.techlabs.facadedesignpattern;

public class TestMain {

	public static void main(String[] args) {
		HotelReception reception=new HotelReception();
		System.out.println("Chinese Menu List :::");
		reception.getChineseMenu();
		
		System.out.println("\nIndian Menu List :::");
		reception.getIndianMenu();
		
		System.out.println("\nItalian Menu List :::");
		reception.getItalianMenu();

	}

}
