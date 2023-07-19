package com.techlabs.inheritanceclass;

public class Person {
	String name;
	String address;
	String gender;
	int age;
	
	public void setPerson(String name, String address,String gender, int age) {
		this.name=name;
		this.address=address;
		this.gender=gender;
		this.age=age;
	}
	public void PersonDisplay() {
		System.out.println(name);
		System.out.println(address);
		System.out.println(gender);
		System.out.println(age);
	}
	
}
