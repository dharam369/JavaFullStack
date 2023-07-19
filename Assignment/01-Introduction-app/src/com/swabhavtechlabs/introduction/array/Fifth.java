package com.swabhavtechlabs.introduction.array;

import java.util.Scanner;

public class Fifth {

	public static void main(String[] args) {
		//jagged Array
		int array[][];
		array=new int[3][];
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			array[i]=new int[i+1];
		}
		System.out.println("Enter Array Element ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				array[i][j]=scanner.nextInt();
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println("");
		}
		
		
		
		
		
		
	}

}
