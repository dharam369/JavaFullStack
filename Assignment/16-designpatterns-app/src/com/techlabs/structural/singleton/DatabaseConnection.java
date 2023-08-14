package com.techlabs.structural.singleton;

public class DatabaseConnection {
	private static DatabaseConnection database=new DatabaseConnection(); //Eager Instantiation
	private DatabaseConnection() {
		
	}
	public static DatabaseConnection getDatabaseConnection() {
		return database;
	}
}
