package com.techlabs.interfaces.defaultmethod;


public class Circle1 implements IShape1,IShape2{
	private int radius;

	public Circle1(int radius) {
		//super();
		this.radius = radius;
	}
	
	
	public void volume() {
		System.out.println("Inside circle volume");      //This creates no error if method is default in interface
	}
		//If we not redefine volune() then it gives compiletime error
	
	
}
