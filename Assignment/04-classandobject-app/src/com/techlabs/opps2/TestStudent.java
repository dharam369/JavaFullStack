package com.techlabs.opps2;

import com.techlabs.opps2.Student;

public class TestStudent {

	public static void main(String[] args) {
		//Student student = new Student();
		Student student;
		student = new Student();
		
		
		student.Print();
		System.out.println(student.getName());
		System.out.println(student.getRollnumber());
		System.out.println(student.getPercentage());
		
		student.setName("Dharam veer");
		student.setRollnumber(11);
		student.setPercentage(90);

		System.out.println(student.getName());
		System.out.println(student.getRollnumber());
		System.out.println(student.getPercentage());
		student.Print();
		
		Student student3=new Student("Ramu",12);
		student3.Print();
		
		System.out.println(student3); //autmatically invoke tostring method
		
		
	}

}
