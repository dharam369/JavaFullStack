package com.swabhavtechlabs.introduction.Assignment;

import java.util.Scanner;

public class Treasure {
	
	// Recommendation-> Use next() in place of nextLine() function if your input is string.
	// .equalsIgnoreCase("STR") or .toLowerCase() and .equals("STR")
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Treasure Island.\n"+"Your mission is to find the treasure.");
		Scanner scanner=new Scanner(System.in);
		System.out.println("left or right?");
		String direction= scanner.nextLine();
		if(!direction.equalsIgnoreCase("left"))
		{
			System.out.println("Fall into a hole.\n"+"Game Over.\n");
			return;
		}
		else
		{
			System.out.println("swim or wait?");
			String desire= scanner.nextLine();
			if(!desire.toLowerCase().equals("wait"))
			{
				System.out.println("Attacked by trout.\n"+"Game Over.");
				return;
			}
			else
			{
				System.out.println("Which door?");
				String door= scanner.nextLine();
				door=door.toLowerCase();
				if(door.equals("red"))
				{
					System.out.println("Burned by fire.\n"+"Game Over.");
					return;
				}
				else if(door.equals("yellow"))
				{
					System.out.println("You Win!");
					return;
				}
				else if(door.equals("blue"))
				{
					System.out.println("Eaten by beasts.\n"+"Game Over.");
					return;
				}
				else
				{
					System.out.println("Game Over.");
					return;
				}
				
			}
		}
		
	}

}
