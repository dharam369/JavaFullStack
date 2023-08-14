package com.techlabs.exception;

public class Test {
	public static void main(String args[]) {
		try {
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			
			double c=a/b;
			System.out.println(c);
		}catch (ArithmeticException e) {
			System.out.println("You can not devide by zeo");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please provide both input");
		}
		catch(NumberFormatException e) {
			System.out.println("Please provide right inputs : integer");
		}
		
		finally {
			System.out.println("Close memory ect.");
		}
		System.out.println("bye");
	}
}
