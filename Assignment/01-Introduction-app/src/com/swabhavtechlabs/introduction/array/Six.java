package com.swabhavtechlabs.introduction.array;

import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		//Matrix Multiplication
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Matrix1 Dimentions: ");
		int n1=scanner.nextInt();
		int m1=scanner.nextInt();
		System.out.println("Enter Matrix2 Dimentions: ");
		int n2=scanner.nextInt();
		int m2=scanner.nextInt();
		
		if(m1!=n2&&m2!=n1) {
			System.out.println("Multiplication is not possible");
			return;
		}
		int array1[][],array2[][];
		array1=new int[n1][m1];
		array2=new int[n2][m2];
		
		System.out.println("Enter Matrix1 Elements: ");
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<m1;j++)
			{
				array1[i][j]=scanner.nextInt();
			}
		}
		System.out.println("Enter Matrix2 Elements: ");
		for(int i=0;i<n2;i++)
		{
			for(int j=0;j<m2;j++)
			{
				array2[i][j]=scanner.nextInt();
			}
		}
		
		if(m1==n2)
		{
			System.out.println("Matrix1 X Matrix2 will be :");
			int array[][];
			array =new int[n1][m2];
			for(int i=0;i<n1;i++)
			{
				for(int j=0;j<m2;j++)
				{
					int elementsum=0;
					for(int k=0;k<m1;k++)
					{
						elementsum+=(array1[i][k]*array2[k][j]);
					}
					array[i][j]=elementsum;
					System.out.print(array[i][j]+"  ");
				}
				System.out.println("");
			}
		}
		else
		{
			System.out.println("Matrix2 X Matrix1 will be :");
			int array[][];
			array =new int[n2][m1];
			for(int i=0;i<n2;i++)
			{
				for(int j=0;j<m1;j++)
				{
					int elementsum=0;
					for(int k=0;k<m2;k++)
					{
						elementsum+=(array2[i][k]*array1[k][j]);
					}
					array[i][j]=elementsum;
					System.out.print(array[i][j]+"  ");
				}
				System.out.println("");
			}
		}

	}

}
