package com.techlabs.interfaces.staticmethod;

public class SemiCircle extends Circle {
	public void area() {
		System.out.println("Area in semicircle");
	}
	static void Circle() {
		System.out.println("hi");   // static is class/interface property so it not override
	}
}
