package com.swabhavtechlabs.introduction.Assignment;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		
		do
		{
			Random random=new Random();
			int randomNumber = random.nextInt(100)+1;
			Scanner scanner=new Scanner(System.in);
			int userGuessNumber;
			int count=1;
			System.out.println(randomNumber);	
			do
			{
				if(count==1)
				{
					System.out.println("Guess a number :");
				}
				else
				{
					System.out.println("Guess number again :");
				}
				userGuessNumber=scanner.nextInt();
				
				if(userGuessNumber>randomNumber)
				{
					System.out.println("Sorry, Too High!");
				}
				else if(userGuessNumber<randomNumber)
				{
					System.out.println("Sorry, Too low!");
				}
				else
				{
					System.out.println("You won in "+count+" attempt.");
					break;
				}
				count++;
			}while(userGuessNumber!=randomNumber);
			System.out.println("Do you want to play the game again yes/no:");
			String choice = scanner.next();
			if(choice.equalsIgnoreCase("no"))
			{
				//scanner.close();
				System.exit(0);
				
			}
		}while(true);
		
		
	}

}

