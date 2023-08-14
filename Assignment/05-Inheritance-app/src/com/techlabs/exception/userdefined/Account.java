package com.techlabs.exception.userdefined;

public class Account {
	private String name;
	private int accountnumber;
	private int balance;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Account(String name, int accountnumber, int balance) {
		//super();
		this.name = name;
		this.accountnumber = accountnumber;
		this.balance = balance;
	}
	public void deposit(int amount) {
		balance+=amount;
	}
	public void withdraw(int amount) {
		try {
		if(balance-amount<5000)
			throw new MinimumBalanceException(balance);
		balance-=amount;
		}
		catch(MinimumBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
	public void show() {
		System.out.println("Your Account Number is "+accountnumber+" ::: "+name+" ::: "+balance);
	}
	
}
