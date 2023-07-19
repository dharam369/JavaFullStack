package com.techlabs.opps2;

public class Student2 {
	private String name;
	private int rollnumber;
	private double percentage;
	
	Student2(){
		this.name="Sohani";
		this.rollnumber=12;
		this.percentage=90.34;
	}
	Student2(String name, int rollno,double percentage){
		this.name=name;
		this.rollnumber=rollno;
		this.percentage=percentage;
	}
	
	private void Display() {
		System.out.println(name);
		System.out.println(rollnumber);
		System.out.println(percentage);
	}
	
	public void Print() {
		Display();
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
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
}
