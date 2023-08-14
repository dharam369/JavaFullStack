package com.techlabs.adapter;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	List<IItems> itmes=new ArrayList<IItems>();

	public ShoppingCart(List<IItems> itmes) {
		super();
		this.itmes = itmes;
	}

	public List<IItems> getItmes() {
		return itmes;
	}

	public void setItmes(List<IItems> itmes) {
		this.itmes = itmes;
	}
	
	public void addItemsToCart(List<IItems> items) {
		this.itmes.addAll(items);
		
	}
	
	public void getCartItems() {
		System.out.println("\nList of Items are as follows :");
		for(IItems item: itmes) {
			System.out.print(item.getItemName()+", ");
		}
	}
	
	public double getCartPrice() {
		double price=0;
		for(IItems item: itmes) {
			price+=item.getItemPrice();
		}
		return price;
	}
	
	public void displayCart() {
		System.out.println("\nItems Cart are as follows :");
		for(IItems item: itmes) {
			System.out.println(item.getItemName()+" "+item.getItemPrice());
		}
	}
	
	
}
