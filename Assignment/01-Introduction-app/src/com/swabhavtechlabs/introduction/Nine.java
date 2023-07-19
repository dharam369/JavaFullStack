package com.swabhavtechlabs.introduction;

import java.util.Scanner;

public class Nine {

	public static void main(String[] args) {
		// Sum of Digit
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter A Number:");
		int number = scanner.nextInt();	//1234
		System.out.println("Number is : "+number);
		
		int sum=0;
		while(number!=0)
		{
			sum+=(number%10);
			number=number/10;
		}
		System.out.println("Sum of Digits is : "+sum);
		
	}

}
