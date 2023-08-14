package com.techlabs.interfaces;

public class Rectangle implements IShape {
	private int length;
	private int width;
	public Rectangle(int length, int width) {
		//super();
		this.length = length;
		this.width = width;
	}
	public void area() {
		System.out.println("Area of rectangle is : "+(width*length));
	}
}
