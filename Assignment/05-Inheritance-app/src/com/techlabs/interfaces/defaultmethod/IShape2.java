package com.techlabs.interfaces.defaultmethod;

public interface IShape2 {
	
	
	default void volume() {
		System.out.println("Inside interface IShape2");
	}
}
