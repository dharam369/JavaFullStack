package com.techlabs.week3;

public class NoIfTest {

	public static void main(String[] args) {
		String username="admin";
		
		if(!isValid(username)) {
			System.out.println("Stop");
			return;		
		}
		
		System.out.println("Go Ahead");
	}

	private static boolean isValid(String username) {
		if(username!="admin")
		return false;
		
		return true;
	}

}
/*Always try to put negative or termination condtion first because 
 * program termination statements contains 2 to 3 lines about

but otherpart contain a lot
*/