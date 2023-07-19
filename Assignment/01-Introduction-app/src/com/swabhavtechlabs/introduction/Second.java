package com.swabhavtechlabs.introduction;

public class Second {

	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("Before swapping :");
		System.out.println("a="+a+"\tb="+b);
		
		a=a+b;//a=30,b=20
		b=a-b;//b=10
		a=a-b;
		
		a=a-b;//a=-10,b=20
		b=a+b;//b=10
		a=b-a;
		
		System.out.println("After swapping :");
		System.out.println("a="+a+"\tb="+b);

	}

}
