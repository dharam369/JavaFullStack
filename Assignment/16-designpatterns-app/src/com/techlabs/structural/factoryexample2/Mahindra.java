package com.techlabs.structural.factoryexample2;

public class Mahindra implements ICars{

	@Override
	public void start() {
		System.out.println("Mahindra is starting");
		
	}

	@Override
	public void stop() {
		System.out.println("Mahindra is stoping");
		
	}

}
