package com.techlabs.week3;

import java.util.Random;
import java.util.Scanner;

public class RollHoldAssignment {
	static int turns_count=1;
	static int turns_score=0;
	static int total_score=0;
	static char choice;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(total_score<20) {
			
			TurnPrint();
			RollorHold(scanner,choice);
		}
		
		AttempPrint();
	}
	
	private static void AttempPrint() {
		System.out.println("You Score "+total_score);
		System.out.println("You attempts "+turns_count+" turns");
		
	}

	private static void TurnPrint() {
		System.out.println("Turn "+turns_count);
		
	}

	private static void RollorHold(Scanner scanner, char choice) {
		System.out.println("Roll or Hold?(r/h) :");
		choice=scanner.next().charAt(0);
		ChoiceAct(choice);
		
	}

	private static void ChoiceAct(char choice) {
		if(choice=='r') {
			RChoice();
			return;
		}
		HChoice();	
	}

	private static void HChoice() {
		HPrint();
		turns_score=0;
		turns_count++;
	}

	private static void HPrint() {
		System.out.println("Turn Score : "+turns_score);
		if(ScoreValid())
		System.out.println("Totat Score : "+total_score);
		
		
	}

	private static boolean ScoreValid() {
		if(total_score<20)
			return true;
		return false;
	}

	private static void RChoice() {
		int dice= DiceValue();
		System.out.println(dice);
		if(dice==1) {
			DiceOne();
			return;
		}
		turns_score= turns_score+dice;
		total_score+=dice;
		
		
	}

	private static void DiceOne() {
		DiceOnePrint();
		turns_score=0;
		turns_count++;
		total_score=0;
		
	}

	private static void DiceOnePrint() {
		System.out.println("No Score : Turn Over!");
	}

	private static int DiceValue() {
		Random random=new Random();
		int dicevalue= random.nextInt(6)+1;
		return dicevalue;
	}

}
