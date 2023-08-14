package com.techlabs.abstracts;

public class Rectangle extends Shape{
	private int width;
	private int length;
	
	public Rectangle(int width, int length) {
		
		this.width = width;
		this.length = length;
	}

	public double area() {
		return width*length;
	}
	
}
