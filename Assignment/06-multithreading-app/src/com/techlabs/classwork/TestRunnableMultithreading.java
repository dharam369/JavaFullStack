package com.techlabs.classwork;

public class TestRunnableMultithreading {

	public static void main(String[] args) {
		RunnableMultithread ru=new RunnableMultithread("Runable Thread");
		Thread thread=new Thread(ru);
		thread.start();
		
		System.out.println("Run");
	}

}
