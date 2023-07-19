package com.swabhavtechlabs.introduction.operator;

public class DebugTest {

	public static void main(String[] args) {
		int a=5;
		int b=7;
		
		int c=addition(a,b);
		
		System.out.println("Addition is :"+c);
		
	}

	private static int addition(int a, int b) {
		int as=square(a);
		int bs=square(b);
		a=as;
		return a+b;
	}

	private static int square(int a) {
		return a*a;
	}	
}


// POC: step Into, step return, step over, resume