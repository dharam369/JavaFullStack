package com.techlabs.structural.factory;

public abstract class Account {
	protected int accountnumber;
	public abstract double getInterestRate();
	public Account(int accountnumber) {
		super();
		this.accountnumber = accountnumber;
	}
	
}
