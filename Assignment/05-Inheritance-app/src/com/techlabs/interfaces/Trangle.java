package com.techlabs.interfaces;

public class Trangle implements IShape{
	private int base;
	private int hight;
	
	
	public Trangle(int base, int hight) {
		//super();
		this.base = base;
		this.hight = hight;
	}

	public void area() {
		System.out.println("Area of rectangle is : "+(0.5*base*hight));
	}
}
