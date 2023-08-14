package com.techlabs.list.objects.classassignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class EmployeeTest {

	public static void main(String[] args) {
		List<Employee> employees=new ArrayList<Employee>();
		employees.add(new Employee(1,"Radhe",12000));
		employees.add(new Employee(2,"Shyam",15000));
		employees.add(new Employee(4,"Sita",16000));
		employees.add(new Employee(3,"Raghav",15000));
		
		for(int i=0;i<employees.size();i++)
		{
			System.out.println(employees.get(i));
		}
		System.out.println("\n Advance for loop");
		for(Employee employee: employees)
		{
			System.out.println(employee);
		}
		System.out.println("\nIterator");
		Iterator employeeiterator= employees.iterator();
		while(employeeiterator.hasNext()) {
			System.out.println(employeeiterator.next());
		// System.out.println(employeeiterator.next().getName()); //:-> it gives error. 
			// so we need to typecast it as we did in student class
		}
		
		System.out.println("\n ListIterator");
		
		ListIterator employeelistiterator= employees.listIterator();
		while(employeelistiterator.hasNext()) {
			System.out.println(employeelistiterator.next());
		}
		while(employeelistiterator.hasPrevious()) {
			System.out.println(employeelistiterator.previous());
		}
	}

}
