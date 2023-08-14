package com.techlabs.structural.factory;

public class AccountFactory {
	public static Account getAccount(String type) {
		if(type.equalsIgnoreCase("Savings"))
			return new SavingsAccount(111,"Savings");
		if(type.equalsIgnoreCase("current"))
			return new CurrentAccount(102,"CurrentAccount");
		return null;
	}
}
