package com.techlabs.facade.serializationdeserialization;

public class Test {

	public static void main(String[] args) {
		MovieManager manager=new MovieManager();
		MovieController controller=new MovieController(manager);
		controller.start();

	}

}
