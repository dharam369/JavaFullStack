package com.techlabs.structural.factory;

public class AccountTest {

	public static void main(String[] args) {
/*		Account account=new SavingsAccount(111,"Savings");
		System.out.println(account);
		
		account=new CurrentAccount(102,"CurrentAccount");  // Tight coupling , also violated abstraction
		System.out.println(account);
*/

		Account account=AccountFactory.getAccount("savings");
		System.out.println(account.accountnumber);
		System.out.println(account);
		account=AccountFactory.getAccount("cuRRent");
		System.out.println(account);		
		
	}

}
