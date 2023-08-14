package com.techlabs.ocp.violation;

import java.util.Scanner;

public class FixedDepositTest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter accountNumber, name, principal, duration");
		int accountNumber=scanner.nextInt();
		String name=scanner.next();
		double principal=scanner.nextDouble();
		int duration=scanner.nextInt();
		System.out.println("Enter choice for festival 1. NEWYEAR, 2.DIWALI, 3.HOLI , 4/any.OTHER");
		int choice=scanner.nextInt();
		
		FestivalType festival;
		
		if(choice==1)
			festival=FestivalType.NEWYEAR;
		else if(choice==2)
			festival=FestivalType.DIWALI;
		else if(choice==3)
			festival=FestivalType.HOLI;
		else
			festival=FestivalType.OTHER;
		
		
		FixedDeposit fixeddeposit=new FixedDeposit(accountNumber,name, principal, duration, festival);
		fixeddeposit.printdetails();
		

	}

}
