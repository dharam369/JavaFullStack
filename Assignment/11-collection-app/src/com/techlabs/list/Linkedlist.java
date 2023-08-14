package com.techlabs.list;

import java.util.LinkedList;
import java.util.List;

public class Linkedlist {

	public static void main(String[] args) {
		List<String> name1=new LinkedList<String>();
		name1.add("Ram");
		// name1.addFirst("Har"); //:-> This gives error
		// name1.addLast("Mohan");  //:-> This gives error
		// because reference of super class object can only access that methods of inherited class which are override.
		System.out.println(name1);
		
		LinkedList<String> name=new LinkedList<String>();
		name.addFirst("Har");
		name.addLast("Mohan");
		name.add("Shyam");
		System.out.println(name);
		// name.add(5,"Dharam"); //:-> Exception in thread "main" java.lang.IndexOutOfBoundsException:
		name.add(3,"Dharam");
		
		LinkedList<String> nameclone =(LinkedList<String>) name.clone();
		System.out.println(nameclone);
		
		name.clear();
		System.out.println(nameclone);
		System.out.println(name);
		
		System.out.println(nameclone.get(2));
		System.out.println(nameclone.getLast());
		
		System.out.println(nameclone.element());
		System.out.println(nameclone);
		nameclone.offer("Veer");
		System.out.println(nameclone);
		System.out.println(nameclone.poll());
		System.out.println(nameclone);
		System.out.println(nameclone.peek());
		System.out.println(nameclone);
		System.out.println(nameclone.remove());
		System.out.println(nameclone);
		System.out.println(nameclone.size());
		
	}

}
