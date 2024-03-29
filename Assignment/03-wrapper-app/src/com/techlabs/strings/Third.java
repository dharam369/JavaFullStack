package com.techlabs.strings;

public class Third {

	public static void main(String[] args) {
		/* StringBuilder is not synchronized so that 
		 * it is not thread-safe. By not being synchronized, 
		 * the performance of StringBuilder can be better than StringBuffer.
		 * 
		If we are working in a single-threaded environment, 
		using StringBuilder instead of StringBuffer may result in increased performance.
		This is also true of other situations such as a StringBuilder local variable 
		where only one thread will be accessing a StringBuilder object.
		 */
		
		// StringBuilder -> mutable -> At a time, 2 thread can call the method
		
		StringBuilder name = new StringBuilder("Nitesh");
		System.out.println(name+"Tiwari");
		name.append(" Tiwari");
		name.append('G');
		System.out.println(name);

	}
}

/*We need to build more program on string builder*/
