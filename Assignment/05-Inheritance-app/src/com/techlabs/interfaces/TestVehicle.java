package com.techlabs.interfaces;

public class TestVehicle {

	public static void main(String[] args) {
		IVehicle vehicle;
		vehicle=new Car();
		vehicle.getspeed();
		vehicle.getVehicleType();
		
		vehicle=new Truck();
		vehicle.getspeed();
		vehicle.getVehicleType();

	}

}
