package com.swabhavtechlabs.introduction.Assignment;

import java.util.Random;
import java.util.Scanner;

public class RandomString {

	public static void main(String[] args) {
		System.out.println("Input A Word");
		Scanner scanner=new Scanner(System.in);
		String userinputstring=scanner.next(); //monocept
		int size=userinputstring.length();
		char word[] = userinputstring.toCharArray();
		
		char temp[];
		temp=new char[size];
		for(int i=0;i<size;i++)
		{
			temp[i]='-';
		}
		
		Random random=new Random();
		int random1=random.nextInt(size-1);
		for(int i=0;i<random1;i++)
		{
			
			int index=random.nextInt(size-2)+2;
			temp[index]=word[index];
			//System.out.println(index);
		}
		
		String modifiedString = new String(temp);
		System.out.println("Guess! and Fill the Word " + modifiedString);
		int count1=0;
		int count2=0;
		while(count1<size-random1)
		{
			System.out.println("Guess Char");
			String s1=scanner.next();
			char userchar=s1.charAt(0);
			int i;
			for( i=0;i<size;i++)
			{
				if(userchar==word[i]&&temp[i]=='-')
				{
					break;
				}
			}
			if(i==size)
			{
				count2++;
				if(count2==10)
				{
					System.out.println("You lost!");
					return;
				}
				System.out.println("Entered element not found in Remaing Letters");
			}
			else
			{
				
					temp[i]=word[i];
					count1++;
					modifiedString = new String(temp);
					System.out.println("\nNow String is :" + modifiedString);
				
			}
		}
		
		System.out.println("Congratuations you won the Game!");
		
		
		
		

	}

}
