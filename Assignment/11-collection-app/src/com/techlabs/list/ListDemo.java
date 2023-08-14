package com.techlabs.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List names=new ArrayList();
//		ArrayList names=new ArrayList();  //-> This is also correct

		System.out.println(names);
		
		names.add("Ramesh");
		names.add("Ram");
		names.add("Sita");
		names.add("HanumanG");
		names.add(10.3);
		names.add(true);
		names.add(21);
		
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
