package com.techlabs.solution;

public class TacCalculator {
	public double calculatetax(Invoice invoice){
		return invoice.getAmount()*invoice.getTax()/100;
	}
}
