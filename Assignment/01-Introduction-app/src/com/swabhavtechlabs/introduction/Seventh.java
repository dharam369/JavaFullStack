package com.swabhavtechlabs.introduction;

import java.util.Scanner;

public class Seventh {

	public static void main(String[] args) {
		// Reverse Number
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter A Number:");
		int number = scanner.nextInt();	//1234
		System.out.println("Number is : "+number);
		
		int reverseNumber=0;
		while(number!=0)
		{
			reverseNumber=reverseNumber*10+(number%10);
			number=number/10;
		}
		System.out.println("Reverse Number is : "+reverseNumber);
		
	}

}
