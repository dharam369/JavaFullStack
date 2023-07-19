package com.swabhavtechlabs.introduction.array;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		// sum of array
		System.out.println("Enter Size of Array :");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int array[];
		array=new int[n];
		System.out.println("Enter Array Elements :");
		for(int i=0;i<n;i++)
		{
			int element=scanner.nextInt();
			array[i]=element;
		}
		
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=array[i];
		}
		System.out.println("Sum of Array Elements is :"+sum);
		
	}

}
