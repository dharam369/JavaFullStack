package com.techlabs.abstractfactorydesignpattern;

public class MarutiFactory implements ICarFactory{

	@Override
	public ICars makecar() {
		// TODO Auto-generated method stub
		return new Maruti();
	}

}
