package com.techlabs.opps;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.println("Enter ID");
		int id=scanner.nextInt();
		employee.setEid(id);
		
		System.out.println("Enter Name");
		String name=scanner.next();
		employee.setEname(name);
		
		System.out.println("Enter Salary");
		int salary=scanner.nextInt();
		employee.setSalary(salary);
		
		System.out.println("Output is:");
		
		System.out.println(employee.getEid());
		System.out.println(employee.getEname());
		System.out.println(employee.getSalary());
		
		Employee employee1 = new Employee(12,"Ramesh",12000);
		

		System.out.println(employee1.getEid());
		System.out.println(employee1.getEname());
		System.out.println(employee1.getSalary());

	}

}