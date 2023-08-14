package com.techlabs.inheritanceclass.constructor;

import java.util.Scanner;

public class ManagerTest {

	public static void main(String[] args) {
		System.out.println("Enter Manager Datails respectively :: name, address, employeeid, salary");
		
		Manager manager[]=new Manager[10];
		Scanner scanner=new Scanner(System.in);
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter Manager "+(i+1)+" Deatails");
			
			String name;
			String address;
			int employeeid;
			int salary;
			
			name=scanner.next();
			address=scanner.next();
			employeeid=scanner.nextInt();
			salary=scanner.nextInt();
			
			manager[i]=new Manager(name, address, employeeid, salary);
		}
		print(manager);
	}

	private static void print(Manager[] manager) {
		for(int i=0;i<manager.length;i++) {
			System.out.println("=============\nManager "+(i+1)+" Details:");
			manager[i].personDisplay();
			manager[i].employeeDisplay();
			manager[i].managerDisplay();
		}
		
	}

}
