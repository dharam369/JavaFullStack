package com.techlabs.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		String filepath="E:\\Full Stack Java\\Employees.txt";
		Employee employee[]=new Employee[2];
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter 10 Employees Details as(id,name,salary) for Serialization : ");
		for(int i=0;i<employee.length;i++)
		{
			int id;
			String name;
			int salary;
			
			id=scanner.nextInt();
			name=scanner.next();
			salary=scanner.nextInt();
			
			employee[i]=new Employee(id, name, salary);
		}
		
		Serialize(filepath,employee);
		
		employee=null;
		Deserialize(filepath,employee);
		
	}

	private static void Print(Employee[] employee) {
		/*for(int i=0;i<employee.length;i++) {
			System.out.println(employee[i]);
		}
		*/
		System.out.println(employee);
	}

	private static void Deserialize(String filepath, Employee[] employee) {
		try {
			FileInputStream file=new FileInputStream(filepath);
			ObjectInputStream in=new ObjectInputStream(file);
			
			
			System.out.println(employee);
			System.out.println("DeSerialization Done Successfully");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void Serialize(String filepath, Employee[] employee) {
		try {
			FileOutputStream file=new FileOutputStream(filepath);
			ObjectOutputStream out=new ObjectOutputStream(file);
			out.writeObject(employee);
			System.out.println("Serialization Done of Array of objects Succesfully");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
