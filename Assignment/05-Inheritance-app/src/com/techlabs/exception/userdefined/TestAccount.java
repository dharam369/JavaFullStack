package com.techlabs.exception.userdefined;

import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) {
		System.out.println("Enter Details to open Account:: as(name,accountnumber,balance):::");
		Scanner scanner=new Scanner(System.in);
		String name=scanner.next();
		int accountnumber=scanner.nextInt();
		int balance=scanner.nextInt();
		Account account=new Account(name,accountnumber, balance);
		account.show();
		account.deposit(12000);
		account.withdraw(20000);
		account.show();

	}

}
