package com.techlabs.interfaces.defaultmethod;


public class Circle implements IShape1{
	private int radius;

	public Circle(int radius) {
		//super();
		this.radius = radius;
	}
	
	
/*	public void volume() {
		System.out.println("Inside circle volume");      //This creates no error if method is default in interface
	}
	//output is:  Inside circle volume
			//	Inside circle volume

*/
	//otherwise output is : Inside interface IShape1 --> 2times
	
	
}
