package com.techlabs.inheritanceclass.twentyonejuly.classassign;

import java.util.Scanner;


public class TestCar {

	public static void main(String[] args) {
		Car cars[]=new Car[5];
		Scanner scanner=new Scanner(System.in);
	/*	for(int i=0;i<5;i++)
		{
			System.out.println("Enter (companyname, mileage, price) of car"+i+1);
			String companyname=scanner.next();
			int mileage=scanner.nextInt();
			int price=scanner.nextInt();
			cars[i]=new Car(companyname, mileage, price);
		} */
		//Print(cars);
		
		try{  
			Car car1=new Car("BMW",40,4000000);
			
			Car car2=(Car) car1.clone();
			 
			System.out.println("Car1 Details");
			car1.displayCar();
			car1.displayFourWheeler();
			car1.displayVehicle();
			
			System.out.println("Car1 Clone(Car2) Details");
			car2.displayCar();
			car2.displayFourWheeler();
			car2.displayVehicle();
			
			
			}catch(CloneNotSupportedException c){}  
		
	}

	private static void Print(Car[] cars) {
		for(int i=0;i<cars.length;i++)
		{
			System.out.println("Details of Car "+i+1);
			cars[i].displayVehicle();
			cars[i].displayFourWheeler();
			cars[i].displayCar();
		}
	}

}
