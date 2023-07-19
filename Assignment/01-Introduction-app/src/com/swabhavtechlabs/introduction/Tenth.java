package com.swabhavtechlabs.introduction;

import java.util.Scanner;

public class Tenth {

	public static void main(String[] args) {
		// Armstrong Number
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter A Number:");
		int number = scanner.nextInt();	//1234
		
		int reserve=number;
		int cubeSum=0;
		while(number!=0)
		{
			int lastDigit = (number%10);
			cubeSum+=(lastDigit*lastDigit*lastDigit);
			number=number/10;
		}
		if(cubeSum==reserve) {
			System.out.println("Number: "+reserve+" is Armstrong");
		}
		else
		{
			System.out.println("Number: "+reserve+" is not Armstrong");
		}
	}

}
