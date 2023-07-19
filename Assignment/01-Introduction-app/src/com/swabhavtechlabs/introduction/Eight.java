package com.swabhavtechlabs.introduction;

import java.util.Scanner;

public class Eight {

	public static void main(String[] args) {
		// Palindrome Number
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter A Number:");
		int number = scanner.nextInt();	//1234
		System.out.println("Number is : "+number);
		int reserve=number;
		
		int reverseNumber=0;
		while(number!=0)
		{
			reverseNumber=reverseNumber*10+(number%10);
			number=number/10;
		}
		
		if(reserve==reverseNumber) {
			System.out.println("Number: "+reserve+" is palindrome");
		}
		else
		{
			System.out.println("Number: "+reserve+" is not palindrome");
		}
		

	}

}
