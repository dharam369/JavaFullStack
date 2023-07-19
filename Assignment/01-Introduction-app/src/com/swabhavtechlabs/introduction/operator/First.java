package com.swabhavtechlabs.introduction.operator;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Height in cm.: ");
		//sout + ctrl+space -> shortcut for print statement
		int height= scanner.nextInt();
		if(height<=120)
		{
			System.out.println("Can't ride");
			return;
		}
		else
		{
			int total_bill=0;
			System.out.println("Enter age: ");
			int age=scanner.nextInt();
			if(age<12)
			{
				total_bill=5;
			}
			else if(age>=12 && age<18)
			{
				total_bill=7;
			}
			else if(age<=55 && age>=45)
			{
				total_bill=0;
			}
			else 
			{
				total_bill=12;
			}
			
			System.out.println("Want photos? (Yes/No)");
			String photoChoice=scanner.next();
			if(photoChoice.equalsIgnoreCase("yes"))
			{
				total_bill+=3;
			}
			
			System.out.println("The total bill is $"+total_bill);
		}
		
	}

}
