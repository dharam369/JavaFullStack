package com.techlabs.solution;

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
		TacCalculator calculator=new TacCalculator();
		InvoicePrinter printer=new InvoicePrinter();
		
		System.out.println("Tax total returns: "+calculator.calculatetax(invoice));
		printer.printinvoice(invoice,calculator);
		
		
	}

}
