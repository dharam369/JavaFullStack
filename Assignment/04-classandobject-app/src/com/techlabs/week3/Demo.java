package com.techlabs.week3;

public class Demo {
	private static int a;
	private int b;
	static {
		System.out.println("Demo1 static block");
	}
	
	Demo(){
		this.a=0;
		this.b=0;
	}
	void Increment() {
		a++;
		b++;
	}
	public void Display() {
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
	
	static {
		System.out.println("Demo2 static block");
	}
}
