package com.techlabs.structural.factoryexample2;



public class CarFactory{
	public ICars getCar(CarType type) {
		if(type==CarType.Mahindra)
			return new Mahindra();
		if(type==CarType.Tata)
			return new Tata();
		if(type==CarType.Maruti)
			return new Maruti();
		return null;
	}
}
