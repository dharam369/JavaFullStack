package com.techlabs.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StudentTest {

	public static void main(String[] args) throws Exception{
Class reflectionString = Class.forName("com.techlabs.reflection.Student");

	//	Class s=Student.class;
	//	Student stud=(Student) s.newInstance();
		
		System.out.println(reflectionString.getName());
		System.out.println(reflectionString.getSimpleName());
		System.out.println(reflectionString.getSuperclass());
		
		
		System.out.println("Constructor in String Class");
		Constructor constructors[]=reflectionString.getDeclaredConstructors();
		for(Constructor constructor:constructors) {
			System.out.println(constructor.getName());
			System.out.println(constructor.getParameters());
		}
		
		System.out.println("Methods in String Class");
		 Method methods[]=reflectionString.getDeclaredMethods();
		for(Method method: methods) {
			System.out.println(method.getName());
		}
		
		System.out.println("Fields in String Class");
		Field fields[]=reflectionString.getDeclaredFields();
		
		for(Field field:fields) {
			System.out.println(field.getName());
		}
		

	}

}
