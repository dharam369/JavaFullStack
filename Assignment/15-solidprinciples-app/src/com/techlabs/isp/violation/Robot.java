package com.techlabs.isp.violation;

public class Robot implements IWorker{
	public void startwork() {
		System.out.println("Robot is start working");
	}
	public void stopwork() {
		System.out.println("Robot is stop working");
	}
	public void eat() {
		System.out.println("Robot is eating");
	}
	public void drink() {
		System.out.println("Robot is drinking");
	}
}
