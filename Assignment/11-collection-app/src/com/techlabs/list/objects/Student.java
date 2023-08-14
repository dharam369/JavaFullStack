package com.techlabs.list.objects;

public class Student {
	private String name;
	private int rollnumber;
	private String email;
	public Student(String name, int rollnumber, String email) {
		super();
		this.name = name;
		this.rollnumber = rollnumber;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollnumber=" + rollnumber + ", email=" + email + "]";
	}
	
	
}
