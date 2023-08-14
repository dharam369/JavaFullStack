package com.techlabs.interfaces;

public class Circle implements IShape{
	private int radius;

	public Circle(int radius) {
		//super();
		this.radius = radius;
	}
	
	public void area() {
		System.out.println("Area of Circle is "+(3.14*radius*radius));
	}
}
