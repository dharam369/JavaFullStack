package com.techlabs.interfaces.defaultmethod;



public class TestShape1 {

	public static void main(String[] args) {
		IShape1 ishape;
		
	
		Circle1 circle=new Circle1(10);
		ishape=circle;
		ishape.volume();
		circle.volume();
		
		IShape2 ishape1;
		ishape1=circle;
		ishape1.volume();
		circle.volume();
		
		
		
		
	}

}
