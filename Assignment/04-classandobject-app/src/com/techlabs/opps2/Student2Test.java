package com.techlabs.opps2;

import com.techlabs.opps2.Student2;

public class Student2Test {

	public static void main(String[] args) {
		//Student student = new Student();
		Student2 student;
		student = new Student2();
		
		student.Print();
		
		student.setName("Dharam veer");
		student.setRollnumber(11);
		student.setPercentage(90);

		student.Print();
		
	}

}
