package com.techlabs.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class GenericsArray {

	public static void main(String[] args) {
		List<String> names=new ArrayList<String>();
//		ArrayList<String> names=new ArrayList<String>();  //-> This is also correct
		
		List<String> name1=new LinkedList<String>();
		List<String> name2=new Stack<String>();           
		List<String> name3=new Vector<String>();
		
		
		System.out.println(names);
		
		names.add("Ramesh");
		names.add("Ram");
		names.add("Sita");
		names.add("HanumanG");
		
//		names.add(10.3); //->This gives error
//		names.add(true); //->This gives error
//		names.add(21);   //->This gives error
		
		System.out.println(names);
		System.out.println(names.getClass());
		names.remove("Ram");
		names.remove(0);  //-> remove at index 0
		System.out.println(names);
		names.set(1,"Raghav"); //replace element at index
		System.out.println(names);
		names.add(1,"Dharam");
		
		System.out.println(names);
		System.out.println(names.get(1));
		
	}

}
