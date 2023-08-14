package com.techlabs.inheritanceclass.twentyonejuly.classassign;

public  class FourWheeler extends Vehicle{
	private int mileage;

	public FourWheeler(String companyname, int mileage) {
		super(companyname);
		this.mileage = mileage;
	}

	public void displayFourWheeler() {
		System.out.println(mileage);
	}
}
