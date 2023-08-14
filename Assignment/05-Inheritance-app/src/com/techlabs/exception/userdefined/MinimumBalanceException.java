package com.techlabs.exception.userdefined;

public class MinimumBalanceException extends Exception{
	private int balance;

	public MinimumBalanceException(int balance) {
	//	super();
		this.balance = balance;
	}
	public String getMessage() {
		return "Insufficient fund: "+balance+":: Minimum balance should be 5000";
	}
}
