package com.swabhavtechlabs.introduction.array;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		// Second Max
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
		
		int max=array[0];
		int res=Integer.MIN_VALUE;
		for(int i=1;i<n;i++)
		{
			if(array[i]>max)
			{
				res=max;
				max=array[i];
			}
			else
			{
				if(array[i]>res)
					res=array[i];
			}
		}
		System.out.println("Second Maximum in Array is :"+res);
	
	}

}
