package com.techlabs.exception.userdefined;

import java.util.Scanner;

public class TestVoter {

	public static void main(String[] args) {
		int age;
		System.out.println("Enter Details as id, name, age");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Age:");
		int id=scanner.nextInt();
		String name=scanner.next();
		age=scanner.nextInt();
		Voter voter=null;
		try {
		
		voter=new Voter(id,name,age);
		System.out.println("Do you want to enter age or not?");
		String choice=scanner.next();
		if(choice.equalsIgnoreCase("Yes")) {
			System.out.println("Age?");
			age=scanner.nextInt();
			voter.setAge(age);
		}
		}catch(AgeNotValid e) {
			System.out.println(e.getMessage());
		}
		System.out.println(voter);
	}

}
