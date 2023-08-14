package com.techlabs.inheritanceclass.constructor;

public class Manager extends Employee {
	private int salary;
	
	public Manager(String name, String address, int employeeid, int salary) {
		super(name, address, employeeid);
		this.salary = salary;
	}

	void managerDisplay() {
		System.out.println("Manager Salary :"+salary);
	}
}
