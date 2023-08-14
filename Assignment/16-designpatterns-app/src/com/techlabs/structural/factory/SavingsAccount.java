package com.techlabs.structural.factory;

public class SavingsAccount extends Account{
	private String type;

	@Override
	public double getInterestRate() {
		// TODO Auto-generated method stub
		return 7.5;
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "SavingsAccount [type=" + type + ", accountnumber=" + accountnumber + "]";
	}

	public void setType(String type) {
		this.type = type;
	}

	public SavingsAccount(int accountnumber, String type) {
		super(accountnumber);
		this.type = type;
	}

	
	
}
