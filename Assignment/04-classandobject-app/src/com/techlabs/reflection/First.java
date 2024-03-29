package com.techlabs.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class First {

	public static void main(String[] args) throws ClassNotFoundException {
		Class reflectionString = Class.forName("java.lang.String");
		
		System.out.println(reflectionString.getName());
		System.out.println(reflectionString.getSimpleName());
		System.out.println(reflectionString.getSuperclass());
		
		
		System.out.println("Constructor in String Class");
		Constructor constructors[]=reflectionString.getDeclaredConstructors();
		for(Constructor constructor:constructors) {
			System.out.println(constructor.getName());
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
