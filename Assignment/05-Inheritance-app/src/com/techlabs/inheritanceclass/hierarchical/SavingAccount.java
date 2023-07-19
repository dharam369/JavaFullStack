package com.techlabs.inheritanceclass.hierarchical;

public class SavingAccount extends Account {
	private int balance;
	
	void setSavingAccount(int balance) {
		this.balance=balance;
	}
	void SavingAccountDisplay() {
		System.out.println("Saving Account Balance: "+balance);
	}
	
}
