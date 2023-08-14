package com.techlabs.isp.solution;

public class IWorkerTest {

	public static void main(String[] args) {
		ILunch labour=new Labour();
		labour.startwork();
		labour.stopwork();
		labour.drink();
		labour.eat();
		
		IWorker robot= new Robot();
		robot.startwork();
		robot.stopwork();
		


	}

}
