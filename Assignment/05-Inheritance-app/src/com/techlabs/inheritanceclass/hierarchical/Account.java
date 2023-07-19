package com.techlabs.inheritanceclass.hierarchical;

public class Account {
	private int accountnumber;
	private String name;
	
	public void setAccount(int accountnumber,String name) {
		this.accountnumber=accountnumber;
		this.name=name;
	}
	
	void AccountDisplay() {
		System.out.println("Account Number: "+accountnumber);
		System.out.println("Account Holder Name: "+name);
	}

}
