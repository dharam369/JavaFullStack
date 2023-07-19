package com.techlabs.inheritanceclass;

public class Student extends Person {
	int rollnumber;
	String classname;
	
	public void setStudent(int rollnumber,String classname)
	{
		this.rollnumber=rollnumber;
		this.classname=classname;
	}
	
	public void StudentDisplay() {
		System.out.println(rollnumber);
		System.out.println(classname);
	}
}
