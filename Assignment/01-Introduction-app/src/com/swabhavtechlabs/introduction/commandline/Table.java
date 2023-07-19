package com.swabhavtechlabs.introduction.commandline;

public class Table {

	public static void main(String[] args) {
		// Table
		int number=Integer.parseInt(args[0]);
		for(int i=1;i<=10;i++)
		{
			System.out.println("number * "+i+" = "+(number*i));
		}

	}

}
