package com.techlabs.inheritanceclass.twentyjuly;

public class Box {
	@Override
	public String toString() {
		return "Box [height=" + height + ", width=" + width + ", length=" + length + "]";
	}
	private double height;
	private double width;
	private double length;
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	public void Display() {
		System.out.println(height);
		System.out.println(length);
		System.out.println(width);
		
	}
	public Box(double height, double width, double length) {
		super();
		this.height = height;
		this.width = width;
		this.length = length;
	}
	
}
