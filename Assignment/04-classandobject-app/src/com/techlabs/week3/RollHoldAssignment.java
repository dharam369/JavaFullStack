package com.techlabs.week3;

import java.util.Random;
import java.util.Scanner;

public class RollHoldAssignment {

	public static void main(String[] args) {
		int turns_count=1;
		int turns_score=0;
		int total_score=0;
		char choice;
		Random random=new Random();
		Scanner scanner = new Scanner(System.in);
		while(total_score<20) {
			System.out.println("Turn "+turns_count);
			System.out.println("Roll or Hold?(r/h) :");
			choice=scanner.next().charAt(0);
			
			if(choice=='r') {
				int dicevalue= random.nextInt(6)+1;
				System.out.println(dicevalue);
				if(dicevalue==1) {
					System.out.println("No Score : Turn Over!");
					turns_score=0;
					turns_count++;
					total_score=0;
					continue;
				}
				turns_score= turns_score+dicevalue;
				total_score+=dicevalue;
			}
			if(choice=='h') {
				System.out.println("Turn Score : "+turns_score);
				if(total_score<20)
				System.out.println("Totat Score : "+total_score);
				turns_score=0;
				turns_count++;
			}	
		}
		System.out.println("You attemp total "+turns_count+" turns");
		System.out.println("Total Score : "+total_score);
		
		
	}

}
