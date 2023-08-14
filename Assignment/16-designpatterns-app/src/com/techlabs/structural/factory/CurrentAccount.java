package com.techlabs.structural.factory;

public class CurrentAccount extends Account {
	private String name;

	@Override
	public double getInterestRate() {
		// TODO Auto-generated method stub
		return 6.5;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CurrentAccount [name=" + name + ", accountnumber=" + accountnumber + "]";
	}

	public CurrentAccount(int accountnumber, String name) {
		super(accountnumber);
		this.name = name;
	}

	
}
