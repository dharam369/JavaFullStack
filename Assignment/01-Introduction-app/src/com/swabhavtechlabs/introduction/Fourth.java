package com.swabhavtechlabs.introduction;

import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		//Max of 2 numbers
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter First number:");
		int number1=scanner.nextInt();
		System.out.println("Enter Second number:");
		int number2=scanner.nextInt();
		System.out.println("You Entered Value as\n number1: "+number1+"\tnumber2: "+number2);
		if(number1>number2)
		{
			System.out.println("Number1 is max as "+number1);
		}
		else if(number2>number1)
		{
			System.out.println("Number2 is max as "+number2);
		}
		else
		{
			System.out.println("Both Equals");
		}
		
	}

}
