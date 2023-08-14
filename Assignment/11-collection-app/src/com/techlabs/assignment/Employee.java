package com.techlabs.assignment;

public class Employee {
	private int employeeid;
	private String name;
	private String profile;
	private int boss;
	private String joiningdate;
	private int salary;
	private int commision;
	private int departmentnumber;
	public Employee(int employeeid, String name, String profile, int boss, String joiningdate, int salary,
			int commision, int departmentnumber) {
		super();
		this.employeeid = employeeid;
		this.name = name;
		this.profile = profile;
		this.boss = boss;
		this.joiningdate = joiningdate;
		this.salary = salary;
		this.commision = commision;
		this.departmentnumber = departmentnumber;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public int getBoss() {
		return boss;
	}
	public void setBoss(int boss) {
		this.boss = boss;
	}
	public String getJoiningdate() {
		return joiningdate;
	}
	public void setJoiningdate(String joiningdate) {
		this.joiningdate = joiningdate;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getCommision() {
		return commision;
	}
	public void setCommision(int commision) {
		this.commision = commision;
	}
	public int getDepartmentnumber() {
		return departmentnumber;
	}
	public void setDepartmentnumber(int departmentnumber) {
		this.departmentnumber = departmentnumber;
	}
	
}
