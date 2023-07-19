package com.techlabs.strings;

public class First {

	public static void main(String[] args) {
		// String -> immutable
		String name = new String("Nitesh");	// Heap
		System.out.println(name+" Tiwari");
		
		String name2 = name + " Tiwari";	// stringpool
		System.out.println(name2);
		
		name = "Shailesh" ;		// stringpool
		System.out.println(name+" Tiwari");
		
		String name3 = new String("Shailesh");	//Heap
		String name4 = "Shailesh";		//stringpool
		
		System.out.println(name3==name);	//false
		System.out.println(name3==name4);	//false
		System.out.println(name4==name);	//true
		
	}

}
