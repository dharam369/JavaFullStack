package com.techlabs.inheritanceclass.multilevel;

public class Person {
	private String name;
	private String address;
	
	public void setPerson(String name, String address) {
		this.address=address;
		this.name=name;
	}
	
	void PersonDisplay() {
		System.out.println("Person Name: "+name);
		System.out.println("Person address: "+address);
	}
}
