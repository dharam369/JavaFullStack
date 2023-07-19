package com.techlabs.inheritanceclass;

public class TestStudent {

	public static void main(String[] args) {
		Student student1=new Student();
	
		//student1.PersonDisplay();
		//student1.StudentDisplay();
		
		student1.setPerson("Ramesh", "Gurgaon", "Male", 24);
		student1.setStudent(1,"10th");
		
		student1.PersonDisplay();
		student1.StudentDisplay();
		
	}

}
