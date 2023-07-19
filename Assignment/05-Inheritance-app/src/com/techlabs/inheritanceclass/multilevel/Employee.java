package com.techlabs.inheritanceclass.multilevel;

public class Employee extends Person{
	private int employeeid;
	
	public void setEmployee(int id){
		this.employeeid=id;
	}
	void EmployeeDisplay() {
		System.out.println("Employee Id : "+employeeid);
	}
}
