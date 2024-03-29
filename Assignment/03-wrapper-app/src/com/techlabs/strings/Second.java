package com.techlabs.strings;

public class Second {

	public static void main(String[] args) {
		/* StringBuffer is thread-safe meaning that 
		  they have synchronized methods to control access 
		  so that only one thread can access StringBuffer object's synchronized code at a time.
		 
		StringBuffer objects are generally safe to use in a multi-threaded environment 
		where multiple threads may be trying to access the same 
		StringBuffer object at the same time
		 */
		
		// StringBuffer -> mutable
		StringBuffer name = new StringBuffer("Nitesh");
		
		// name = name + "Tiwari"; ->Error with StringBuffer Class
		//	name = name + String("Tiwari"); ->Error with StringBuffer Class	
		//	name = name + new StringBuffer("Tiwari"); ->Error with StringBuffer Class
		// name[2] = 'e' ->Error with StringBuffer Class
		
		System.out.println(name.hashCode());
		name.setCharAt(1, 'e');
		System.out.println(name.hashCode());
		System.out.println(name+"Tiwari");
	}
}

/* Explore String Buffer methods*/