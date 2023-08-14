package com.techlabs.solution;

public class InvoicePrinter {
	public void printinvoice(Invoice invoice,TacCalculator calculator) {
		System.out.println(invoice.getId()+invoice.getDescription()+" Amount: "+invoice.getAmount()+" Tax: "+invoice.getTax());
		System.out.println("Total returns: "+calculator.calculatetax(invoice)+invoice.getAmount());
	}
}
