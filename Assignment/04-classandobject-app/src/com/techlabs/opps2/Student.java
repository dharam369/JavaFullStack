package com.techlabs.opps2;

public class Student {
	private String name;
	private int rollnumber;
	private double percentage;
	
	Student(){
		
		this("DharamVEER",11,99);  //Constructor Chaining
		/*
		 
		name="Sohan";
		rollnumber=12;
		percentage=90.34;
		
		 */
	}
	Student(String name, int rollno){
		this.name=name;
		this.rollnumber=rollno; // percentage value is taken by default 0.0. 
		//otherwise we can aso make it as percentage=55.3;
	}
	
	@Override    //return string representation of object
	public String toString() {
		return "Student [name=" + name + ", rollnumber=" + rollnumber + ", percentage=" + percentage + "]";
	}
	Student(String name, int rollno,double percentage){
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
