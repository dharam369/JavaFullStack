package com.techlabs.dip.violation;

public class TaxCalculator extends Exception {
	public DBLogger dblogger;
	public void calculateTax(int amount, int rate) {
		int tax=0;
		try{
			tax=amount/rate;
			System.out.println("Tax: "+tax);
		}
		catch(Exception e) {
			new DBLogger().log("Divide by zero");
		}
	}
}
