package com.techlabs.isp.violation;

public class Labour implements IWorker{
	public void startwork() {
		System.out.println("Labour is start working");
	}
	public void stopwork() {
		System.out.println("Labour is stop working");
	}
	public void eat() {
		System.out.println("Labour is eating");
	}
	public void drink() {
		System.out.println("Labour is drinking");
	}
}
