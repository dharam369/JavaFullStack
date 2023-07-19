package com.techlabs.inheritanceclass.hierarchical;

import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Which kind of Account you want to open: (Current/Saving)");
		String choice= scanner.next();
		if(choice.toLowerCase().equals("saving")) {
			SavingAccount savingaccount= new SavingAccount();
			System.out.println("Enter name, accountnumber, balance respectively ");
			String name=scanner.next();
			int accountnumber=scanner.nextInt();
			int balance=scanner.nextInt();
			
			savingaccount.setAccount(accountnumber, name);
			savingaccount.setSavingAccount(balance);
			
			System.out.println("Your Saving Account Details: ");
			savingaccount.AccountDisplay();
			savingaccount.SavingAccountDisplay();
			
		}
		else if(choice.toLowerCase().equals("current")) {
			CurretAccount currentaccount=new CurretAccount();
			System.out.println("Enter name, accountnumber, Rate of interest respectively ");
			String name=scanner.next();
			int accountnumber=scanner.nextInt();
			int rateofinterest=scanner.nextInt();
			
			currentaccount.setAccount(accountnumber, name);
			currentaccount.setCurentAccount(rateofinterest);
			
			System.out.println("Your Current Account Details: ");
			currentaccount.AccountDisplay();
			currentaccount.CurrentAccountDisplay();
			
		}
		else {
			System.out.println("Enter Correct Types");
		}
		

	}

}
