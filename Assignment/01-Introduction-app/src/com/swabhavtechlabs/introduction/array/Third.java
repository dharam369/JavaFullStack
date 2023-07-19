package com.swabhavtechlabs.introduction.array;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		// sort array in descending order
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
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(array[j]<array[j+1])
				{
					int x=array[j];
					array[j]=array[j+1];
					array[j+1]=x;
				}
			}
		}
		System.out.println("After Sorting :");
		for(int i=0;i<n;i++)
		{
			System.out.println(array[i]);
		}
	}

}
