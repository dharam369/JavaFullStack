package com.techlabs.opps;

public class TestStudent {

	public static void main(String[] args) {
		//Student student = new Student();
		Student student;
		student = new Student();
		
		
		System.out.println(student.getName());
		System.out.println(student.getRollnumber());
		System.out.println(student.getPercentage());
		
		student.setName("Dharam veer");
		student.setRollnumber(11);
		student.setPercentage(90);

		System.out.println(student.getName());
		System.out.println(student.getRollnumber());
		System.out.println(student.getPercentage());
		
	}

}
