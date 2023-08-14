package com.techlabs.abstractfactorydesignpattern;

public class TataFactory implements ICarFactory{

	@Override
	public ICars makecar() {
		// TODO Auto-generated method stub
		return new Tata();
	}

}
