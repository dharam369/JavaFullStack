package com.swabhavtechlabs.introduction.array;

import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		// Addition of two matrix
		Scanner scanner=new Scanner(System.in);
		int array1[][];
		array1= new int[3][3];
		int array2[][];
		array2= new int[3][3];
		
		System.out.println("Input Elements of Matrix1");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				array1[i][j]=scanner.nextInt();
			}
		}
		System.out.println("Input Elements of Matrix2");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				array2[i][j]=scanner.nextInt();
			}
		}
		System.out.println("Addition of Matrix is :");
		int array[][];
		array= new int[3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				array[i][j]=array1[i][j]+array2[i][j];
			}
		}
		
		System.out.println("Matrix1 :");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(array1[i][j]+"\t");
			}
			System.out.println("");
		}
		System.out.println("Matrix2 :");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(array2[i][j]+"\t");
			}
			System.out.println("");
		}
		System.out.println("Addition Matrix :");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(array[i][j]+"\t");
			}
			System.out.println("");
		}
	}

}
