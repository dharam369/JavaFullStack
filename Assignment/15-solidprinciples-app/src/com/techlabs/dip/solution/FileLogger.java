package com.techlabs.dip.solution;

public class FileLogger implements ILogger{
	@Override
	public void log(String err) {
		System.out.println("FileLogged to database : "+err);
	}

}
