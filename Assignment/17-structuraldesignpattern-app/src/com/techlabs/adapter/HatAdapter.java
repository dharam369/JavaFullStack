package com.techlabs.adapter;

public class HatAdapter implements IItems {
	private Hat hat;
	public HatAdapter(Hat hat) {
		super();
		this.hat = hat;
	}
	@Override
	public String getItemName() {
		// TODO Auto-generated method stub
		return hat.getShortname()+" "+hat.getLongname();
	}
	@Override
	public double getItemPrice() {
		double price=hat.getBasicprice()+(hat.getBasicprice()*hat.getTax()/100);
		return price;
	}

	
}
