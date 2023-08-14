package com.techlabs.adapter;

public class Biscuit implements IItems{

	private String name;
	private double mrp;
	
	@Override
	public String getItemName() {
		return this.name;
	}

	@Override
	public double getItemPrice() {
		// TODO Auto-generated method stub
		return this.mrp;
	}

	public Biscuit(String name, double mrp) {
		super();
		this.name = name;
		this.mrp = mrp;
	}

}
