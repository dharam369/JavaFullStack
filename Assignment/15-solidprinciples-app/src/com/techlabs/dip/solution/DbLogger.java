package com.techlabs.dip.solution;

public class DbLogger implements ILogger{

	@Override
	public void log(String err) {
		System.out.println("DBLogged to database : "+err);
	}

}
