package com.techlabs.inheritanceclass.constructor;

public class Person {
	private String name;
	private String address;
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	void personDisplay() {
		System.out.println("Person Name: "+name);
		System.out.println("Person address: "+address);
	}
}
