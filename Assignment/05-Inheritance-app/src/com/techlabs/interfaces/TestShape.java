package com.techlabs.interfaces;

public class TestShape {

	public static void main(String[] args) {
		IShape ishape;
		
		Rectangle rectangle=new Rectangle(10,35);
		rectangle.area();
		ishape=rectangle;
		ishape.area();
		
		Circle circle=new Circle(10);
		circle.area();
		ishape=circle;
		ishape.area();
		
		
		Trangle trangle=new Trangle(10,20);
		trangle.area();
		ishape=trangle;
		ishape.area();
		
	}

}
