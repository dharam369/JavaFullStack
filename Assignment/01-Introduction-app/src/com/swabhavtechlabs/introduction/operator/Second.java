package com.swabhavtechlabs.introduction.operator;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		// 
		Scanner scanner=new Scanner(System.in);
		System.out.println("Input Amount less than 50000 but multiple of 100");
		System.out.println("Enter Windrawal amount: ");
		int amount=scanner.nextInt();
		if(amount>50000) {
			System.out.println("Amount exceeds withdrwal limit of 50000");
			return;
		}
		else if(amount%100!=0) {
			System.out.println("Amount should be in multiples of 100");
			return;
		}
		else
		{
			int twothousandnote=(amount-(amount%2000))/2000;
			amount=amount%2000;
			int fivehundrednote=(amount-(amount%500))/500;
			amount%=500;
			int twohundrednote=(amount-(amount%200))/200;
			amount%=200;
			int hundrednote=(amount-(amount%100))/100;
			amount%=100;
			if(twothousandnote!=0) {
				System.out.println("Two Thousand :"+twothousandnote);
			}
			if(fivehundrednote!=0) {
				System.out.println("Five Hundred :"+fivehundrednote);
			}
			if(twohundrednote!=0) {
				System.out.println("Two Hundred :"+twohundrednote);
			}
			if(hundrednote!=0) {
				System.out.println("Hundred :"+hundrednote);
			}
		}
		return;
	}

}
