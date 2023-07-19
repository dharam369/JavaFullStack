package com.techlabs.opps2;

import java.util.Scanner;

public class Employee1ArrayTest {

	public static void main(String[] args) {
		//Array of objects or class Employee1
		// int arr[]=new int[5];
		Scanner scanner=new Scanner(System.in);
		Employee1 employee1s[]=new Employee1[5];
		
		userInput(employee1s,scanner);
		
		display(employee1s);
		
		boolean isIncrease=true;
		sortIncreasing(employee1s,isIncrease);
		
		display(employee1s);
	}


	private static void sortIncreasing(Employee1[] employee1s,boolean isIncrease) {
		for(int i=0;i<employee1s.length;i++)
		{
			if(isIncrease)
				{ sortIncreaingSalary(employee1s,i);
				System.out.println("In Increasing Order : ");
				}
			else
				{ sortDecreasing(employee1s,i);
				System.out.println("In Decreasing Order : ");
				}
			
		}
		
	}

	private static void sortDecreasing(Employee1[] employee1s, int i) {
		Employee1 temp=new Employee1();
		for(int j=1;j<employee1s.length-i;j++)
		{
			if(employee1s[j-1].getSalary()<employee1s[j].getSalary())
			{
				temp=employee1s[j-1];
				employee1s[j-1]=employee1s[j];
				employee1s[j]=temp;
			}
		}
		
	}


	private static void sortIncreaingSalary(Employee1[] employee1s, int i) {
		Employee1 temp=new Employee1();	
		for(int j=1;j<employee1s.length-i;j++)
		{
			if(employee1s[j-1].getSalary()>employee1s[j].getSalary())
			{
				temp=employee1s[j-1];
				employee1s[j-1]=employee1s[j];
				employee1s[j]=temp;
			}
		}
		
	}

	private static void userInput(Employee1[] employee1s,Scanner scanner) {
		for(int i=0;i<employee1s.length;i++)
		{
			System.out.println("Enter as id name and salary");
			int id=scanner.nextInt();
			String name=scanner.next();
			int salary=scanner.nextInt();
			
			employee1s[i]=new Employee1(id,name,salary);
		}
		
	}

	private static void display(Employee1[] employee1s) {

		for(Employee1 employee1:employee1s) {
			System.out.println(employee1);
		}
	}

}
