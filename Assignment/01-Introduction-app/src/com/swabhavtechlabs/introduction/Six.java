package com.swabhavtechlabs.introduction;

import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter A Number:");
		int number = scanner.nextInt();
		if(number>0)
		{
			System.out.println("Number: "+number+" is positive");
		}
		else if(number<0){
			System.out.println("Number: "+number+" is negative");
		}
		else {
			System.out.println("Number: "+number+" is zero");
		}

	}

}
