package com.techlabs.inheritanceclass.twentyonejuly.classassign;

public class Car extends FourWheeler implements Cloneable{
	private int price;

	public Car(String companyname, int mileage, int price) {
		super(companyname, mileage);
		this.price = price;
	}
	public void displayCar() {
		System.out.println(price);
	}
	// To make clone of objects of Car class we add following method to class
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  
}
