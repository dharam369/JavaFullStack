package com.techlabs.interfaces.defaultmethod;

public interface IShape1 {
	
	default void volume() {
		System.out.println("Inside interface IShape1");
	}
}
