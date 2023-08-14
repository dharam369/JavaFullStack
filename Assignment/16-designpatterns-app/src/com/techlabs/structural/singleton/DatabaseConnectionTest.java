package com.techlabs.structural.singleton;

public class DatabaseConnectionTest {

	public static void main(String[] args) {
		DatabaseConnection db1=DatabaseConnection.getDatabaseConnection();
		
		System.out.println(db1.hashCode());
		DatabaseConnection db2=DatabaseConnection.getDatabaseConnection();
		
		System.out.println(db2.hashCode());
	}

}
