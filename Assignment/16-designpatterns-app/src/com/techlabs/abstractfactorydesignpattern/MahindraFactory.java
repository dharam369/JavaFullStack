package com.techlabs.abstractfactorydesignpattern;

public class MahindraFactory implements ICarFactory{

	@Override
	public ICars makecar() {
		
		return new Maruti();
	}

}
