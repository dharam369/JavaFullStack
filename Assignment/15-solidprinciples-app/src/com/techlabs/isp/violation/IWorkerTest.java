package com.techlabs.isp.violation;

public class IWorkerTest {

	public static void main(String[] args) {
		IWorker labour=new Labour();
		labour.startwork();
		labour.eat();
		labour.drink();
		labour.stopwork();
		
		IWorker robot= new Robot();
		robot.drink();
		robot.eat();
		robot.startwork();
		robot.stopwork();

	}

}
