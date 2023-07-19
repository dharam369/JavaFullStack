package com.swabhavtechlabs.introduction.commandline;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=Integer.parseInt(args[0]);
		int factorial=1;
		for(int i=1;i<=number;i++) {
			factorial*=i;
		}
		System.out.println("Factorial of "+number+" is : "+factorial);
	}

}
