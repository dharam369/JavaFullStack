package com.techlabs.assignment;



import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.*;

public class StringStream {

	public static void main(String[] args) {
		//String[] names= {"Jayesh","Nimesh","Mark","Mahesh","Ramesh"};
//		1. first 3 students sorted in ascending order
		
		List names= (List) Arrays.asList("Jayesh","Nimesh","Mark","Mahesh","Ramesh");
		java.util.List<String> result = ((Collection<String>) names).stream().limit(3).sorted().collect(Collectors.toList());
		
		System.out.println(result);
//		2. first 3 students sorted in ascending order if it contains 'a'
		
		 List<String> res= (List<String>) names.stream().limit(3).filter(s -> ((String) s).contains("a")).sorted().collect(Collectors.toList());
		System.out.println(res);	
		 
//		3. students in descnding order
		List<String> sortedList = (List<String>) names.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedList);
		
		//		4. first 3 characters of all names:
	
		
		
//		5. names of the students that contains less than or equal to 4 characters

		 java.util.List<String> result3 = ((Collection<String>) names).stream().filter(x->x.length()<=4).collect(Collectors.toList());
			System.out.println(result3);
	}

}
