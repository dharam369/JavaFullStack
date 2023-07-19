package com.techlabs.inheritanceclass.multilevel;

public class Manager extends Employee {
	private int salary;
	void setManager(int salary){
		this.salary=salary;
	}
	void ManagerDisplay() {
		System.out.println("Manager Salary :"+salary);
	}
}
