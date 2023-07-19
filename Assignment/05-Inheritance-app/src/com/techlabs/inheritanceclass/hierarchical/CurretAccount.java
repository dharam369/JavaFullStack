package com.techlabs.inheritanceclass.hierarchical;

public class CurretAccount extends Account {
	private int rateofinterest;
	void setCurentAccount(int rateofinterest) {
		this.rateofinterest=rateofinterest;
	}
	public void CurrentAccountDisplay() {
		System.out.println("Rate of Interest : "+rateofinterest);
	}
}
