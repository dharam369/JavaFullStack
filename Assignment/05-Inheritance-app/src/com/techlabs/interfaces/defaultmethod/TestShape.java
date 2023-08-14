package com.techlabs.interfaces.defaultmethod;



public class TestShape {

	public static void main(String[] args) {
		IShape1 ishape;
		
	
		Circle circle=new Circle(10);
		ishape=circle;
		ishape.volume();
		circle.volume();
		
		
		
	}

}
