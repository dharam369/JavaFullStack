package com.techlabs.abstractfactorydesignpattern;

public class ICarFactoryTest {

	public static void main(String[] args) {
		ICarFactory carfactory=new MarutiFactory();
		ICars maruti=carfactory.makecar();
		
		maruti.start();
		maruti.stop();
		
		carfactory=new TataFactory();
		ICars tata=carfactory.makecar();
		
		tata.start();
		tata.stop();
		

	}

}
