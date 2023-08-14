package com.techlabs.ocp.solution;

import java.util.Scanner;

public class TestFixedDeposit {

	public static void main(String[] args) {
/*		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter accountNumber, name, principal, duration respectively");
		int accountnumber=scanner.nextInt();
		String name=scanner.next();
		double principal=scanner.nextDouble();
		int duration=scanner.nextInt();
*/
		IFestivalInterest interest;
		interest=new DiwaliInterest();
		
		FixedDeposit fixeddeposit=new FixedDeposit(111,"Dharam",1200,2,interest);
		CalculateInterest calculateinterest=new CalculateInterest();
		System.out.println(calculateinterest.calculateSimpleInterest(fixeddeposit));
	}

}
