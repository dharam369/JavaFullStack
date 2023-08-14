package com.techlabs.abstracts;

public class Circle extends Shape{
	private int radius;
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	public double area() {
		return 3.14*radius*radius;
	}
	
}
