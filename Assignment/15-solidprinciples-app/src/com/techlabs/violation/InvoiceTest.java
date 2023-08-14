package com.techlabs.violation;

import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter id , description, amount, tax respectively");
		
		int id=scanner.nextInt();
		String description=scanner.next();
		double amount=scanner.nextDouble();
		double tax=scanner.nextDouble();
		
		Invoice invoice=new Invoice(id,description,amount,tax);
		System.out.println("Tax is :"+invoice.calculatetax(amount));
		invoice.printtax();
	}

}
