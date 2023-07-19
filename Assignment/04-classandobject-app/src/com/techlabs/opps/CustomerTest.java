package com.techlabs.opps;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerTest {

	public static void main(String[] args) {
		int id;
		String name;
		String password;
		String email;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Id");
		id=scanner.nextInt();
		System.out.println("Enter Name");
		name=scanner.next();
		
		 //Regular Expression   
        String regex = "^(.+)@(.+)$";  
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regex); 
        
		int count=0;
		
		while(true)
		{
			if(count>=5) {
				System.out.println("Try After some time");
				return;
			}
			if(count==0) {
				System.out.println("Enter Email");
			}
			else {
				System.out.println("Enter Correct Email");
			}
			count++;
			email=scanner.next();
			 Matcher matcher = pattern.matcher(email);  
	         if( matcher.matches()==true)
	        	 break;
		}
		System.out.println("Enter Password");
		password=scanner.next();
		
		Customer customer=new Customer();
		customer.setCustid(id);
		customer.setEmail(email);
		customer.setName(name);
		customer.setPassword(password);
		
		System.out.println(customer.getCustid());
		System.out.println(customer.getName());
		System.out.println(customer.getEmail());
		System.out.println(customer.getPassword());

	}

}


