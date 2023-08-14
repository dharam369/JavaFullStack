package com.techlabs.assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("E:\\Full Stack Java\\emp.txt");
	      
	      Scanner sc = new Scanner(file);
	      
	      StringBuffer sb = new StringBuffer();
	     
	      while(sc.hasNext()) {
	         sb.append(sc.nextLine()+" ");
	      }
	      System.out.println(sb);
	      Employee employee1=new Employee();
	      
	}

}
