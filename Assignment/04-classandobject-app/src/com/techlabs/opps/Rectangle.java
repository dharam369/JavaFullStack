package com.techlabs.opps;

public class Rectangle {
	private int width;
	private int height;
	
	private int area() {
		return width*height;
	}
	
	public void areaPrint() {
		System.out.println("Area of Rectangle is : "+this.area());
	}
	
	public void setWidth(int w)
	{
		width=w;
	}
	public int getWidth() {
		return width;
	}
	public void setHeight(int h)
	{
		height=h;
	}
	public int getHeight() {
		return height;
	}	
}
