package com.techlabs.exception.userdefined;

public class AgeNotValid extends RuntimeException{
	private int age;


	public String toString() {
		return "AgeNotValid [age=" + age + "]";
	}

	public AgeNotValid(int age) {
		//super();
		this.age = age;
	}
	
	public String getMessage() {
		return "Age Not Valid";
	}
}
