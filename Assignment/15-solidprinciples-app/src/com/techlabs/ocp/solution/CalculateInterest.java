package com.techlabs.ocp.solution;

public class CalculateInterest {
	public double calculateSimpleInterest(FixedDeposit fixeddeposit) {
		return fixeddeposit.getPrincipal()*fixeddeposit.getDuration()*fixeddeposit.getInterest().getInterestRate()/100;
	}
}
