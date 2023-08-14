package com.techlabs.dip.solution;

public class TaxCalculateTest {

	public static void main(String[] args) {
		TaxCalculator t1=new TaxCalculator(new DbLogger());
		t1.calculateTax(1000, 0);
		t1.setIlogger(new FileLogger());
		t1.calculateTax(2000, 0);
	}

}
