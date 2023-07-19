package com.swabhavtechlabs.introduction.commandline;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=Integer.parseInt(args[0]);
		for(int i=2;i<=number/2;i++)
		{
			if(number%i==0)
			{
				System.out.println("Number "+number+" is not prime");
				return;
			}
		}
		System.out.println("Number "+number+" is prime");
	}

}
