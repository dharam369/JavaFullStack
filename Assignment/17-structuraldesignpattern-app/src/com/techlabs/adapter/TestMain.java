package com.techlabs.adapter;


import java.util.ArrayList;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		List<IItems> items=new ArrayList<IItems>();
		items.add(new Chocolate("Eclares",20));
		items.add(new Chocolate("CarVery",10));
		items.add(new Chocolate("DairyMilk",50));
		items.add(new Biscuit("Parle G",5));
		items.add(new Biscuit("twenty 20",10));
		items.add(new Biscuit("Butter Bites",20));
		items.add(new Biscuit("CYNC Six",10));
		
		ShoppingCart mycart=new ShoppingCart(items);
		mycart.displayCart();
		mycart.getCartItems();
		System.out.println("\nTotal Payable amount is :"+mycart.getCartPrice());
		
		List<IItems> items2=new ArrayList<IItems>();
		items2.add(new Chocolate("Eclares",20));
		items2.add(new Chocolate("CarVery",10));
		items2.add(new HatAdapter(new Hat("Rahul","Ka Sawal",50,30)));
		items2.add(new HatAdapter(new Hat("Modi G","Ka MaunVrat",20,110)));
		
		mycart.addItemsToCart(items2);
		
		mycart.displayCart();
		mycart.getCartItems();
		System.out.println("\nTotal Payable amount is :"+mycart.getCartPrice());
		

	}

}
