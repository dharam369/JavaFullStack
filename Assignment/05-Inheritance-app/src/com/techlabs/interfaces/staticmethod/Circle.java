package com.techlabs.interfaces.staticmethod;

abstract public class Circle implements IShape1,IShape2{
	static void Circle() {
		System.out.println("hi");    //if it is static then it not work as constructor
	}
}
