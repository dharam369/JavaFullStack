package com.techlabs.structural.factoryexample2;

public class CarTest {

	public static void main(String[] args) {
		CarFactory cartype= new CarFactory();
		ICars car=cartype.getCar(CarType.Mahindra);
		car.start();
		car.stop();

	}

}
