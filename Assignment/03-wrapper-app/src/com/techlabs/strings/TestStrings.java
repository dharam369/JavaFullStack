package com.techlabs.strings;

public class TestStrings {

	public static void main(String[] args) {
		// String Pool Concept
		
		String name = "Nitesh";
		String name2="Nitesh";
		
		//object "Nitesh" is inside stringpool and name refer to that object.
		
		System.out.println(name==name2);   //true
		
		String name3=new String("Nitesh");
		String name4=new String("Nitesh");  //object using new always created on heap and new memory allocated to each object.
		
		System.out.println(name3==name4);	//false
	}

}
