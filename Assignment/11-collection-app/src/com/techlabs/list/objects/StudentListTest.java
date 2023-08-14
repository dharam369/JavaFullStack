package com.techlabs.list.objects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StudentListTest {

	public static void main(String[] args) {
		
		List<Student> students= new ArrayList<Student>();
		
		students.add(new Student("Ram",1,"ram@gmail.com"));
		students.add(new Student("Radhe",2,"radhe@gmail.com"));
		students.add(new Student("Raghav",3,"raghav@gmail.com"));
		System.out.println(students);
		
		
		for(int i=0;i<students.size();i++) {
			System.out.println(students.get(i));
			System.out.println(students.get(i).getRollnumber());	
		}
		System.out.println("For Each Loop");
		for(Student student: students) {
			System.out.println(student);
			System.out.println(student.getName());
		}
		
		System.out.println("Iterator");
		Iterator studentiterator= students.iterator();
		while(studentiterator.hasNext()) {
			Student studenttemp=(Student) studentiterator.next();    //option1 for typecasting
			System.out.println(studenttemp.getName());
			System.out.println(studenttemp);
		}
		
		System.out.println("ListIterator");
		ListIterator<Student> studentlistiterator= students.listIterator();   //option2 for typecasting
		while(studentlistiterator.hasNext()) {
			System.out.println(studentlistiterator.next().getName());
		}
	}

}
