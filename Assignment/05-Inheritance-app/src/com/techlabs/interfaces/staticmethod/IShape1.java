package com.techlabs.interfaces.staticmethod;

public interface IShape1 {
	void area();
	static void volume() {
		System.out.println("Inside interface IShape1");
	}
}
