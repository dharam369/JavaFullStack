package com.techlabs.structural.singleton;

public class Login {
	private static Login login;
	private Login() {
		
	}
//	public static synchronized Login getLogin() {
//		if(login==null)
//		    login=new Login();
//		return login;                            // its also correct
//	}
	

	public static Login getLogin() {
		if(login==null)
		    login=new Login();                 // Lazy instantiation
		return login;
	}
}
