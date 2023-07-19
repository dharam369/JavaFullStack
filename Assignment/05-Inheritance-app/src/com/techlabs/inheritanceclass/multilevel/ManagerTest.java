package com.techlabs.inheritanceclass.multilevel;

import java.util.Scanner;

public class ManagerTest {

	public static void main(String[] args) {
		Manager manager=new Manager();
		
		Scanner scanner=new Scanner(System.in);
		String name;
		String address;
		int employeeid;
		int salary;
		System.out.println("Enter name, address, employeeid and salary respectively");
		name=scanner.next();
		address=scanner.next();
		employeeid=scanner.nextInt();
		salary=scanner.nextInt();
		
		manager.setEmployee(employeeid);
		manager.setManager(salary);
		manager.setPerson(name, address);
		
		System.out.println("Managers Details are : ");
		manager.PersonDisplay();
		manager.EmployeeDisplay();
		manager.ManagerDisplay();
		

	}

}
