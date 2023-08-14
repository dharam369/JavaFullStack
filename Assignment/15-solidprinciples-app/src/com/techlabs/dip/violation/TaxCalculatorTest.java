package com.techlabs.dip.violation;

public class TaxCalculatorTest {

	public static void main(String[] args) {
		TaxCalculator t1=new TaxCalculator();
		t1.calculateTax(100, 20);
		TaxCalculator t2=new TaxCalculator();
		t1.calculateTax(2000, 0);
	}

}
