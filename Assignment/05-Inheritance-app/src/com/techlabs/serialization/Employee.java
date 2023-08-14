package com.techlabs.serialization;

import java.io.Serializable;

public class Employee implements Serializable{
	private int eid;
	private String name;
	private int salary;
	
	public Employee(int eid, String name, int salary) {
		//super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
