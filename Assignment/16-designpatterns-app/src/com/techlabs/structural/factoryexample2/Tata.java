package com.techlabs.structural.factoryexample2;

public class Tata implements ICars{

	@Override
	public void start() {
		System.out.println("Tata is starting");
		
	}

	@Override
	public void stop() {
		System.out.println("Tata is stoping");
		
	}

}
