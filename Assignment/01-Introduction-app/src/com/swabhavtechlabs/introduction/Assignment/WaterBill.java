package com.swabhavtechlabs.introduction.Assignment;

import java.util.Scanner;

public class WaterBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Read No. of units consumed");
		int numberOfUnitConsumed=scanner.nextInt();
		int charge=0;
		int meter_charge=75;
		if(numberOfUnitConsumed<=100)
		{
			charge=numberOfUnitConsumed*5;
		}
		else 
		{
			if(numberOfUnitConsumed<=250)
			{
				charge=numberOfUnitConsumed*10;
			}
			else
			{
				charge=numberOfUnitConsumed*20;
			}
		}
		int total_bill=charge+meter_charge;
		System.out.println("Total Water Bill = "+total_bill);
		return;
	}

}
