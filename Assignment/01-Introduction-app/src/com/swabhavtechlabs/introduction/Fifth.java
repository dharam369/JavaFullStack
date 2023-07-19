package com.swabhavtechlabs.introduction;

import java.util.Scanner;

public class Fifth {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter A Number:");
		int number = scanner.nextInt();
		if(number%2==0)
		{
			System.out.println("Number: "+number+" is even");
		}
		else {
			System.out.println("Number: "+number+" is odd");
		}

	}

}
