package com.techlabs.inheritanceclass.constructor;


public class Employee extends Person{
	private int employeeid;
	
	public Employee(String name, String address, int employeeid) {
		super(name, address);
		this.employeeid = employeeid;
	}

	void employeeDisplay() {
		System.out.println("Employee Id : "+employeeid);
	}
}
