package com.techlabs.structural.factoryexample2;

public class Maruti implements ICars{

	@Override
	public void start() {
		System.out.println("Maruti is starting");
		
	}

	@Override
	public void stop() {
		System.out.println("Maruti is stoping");
		
	}

}
