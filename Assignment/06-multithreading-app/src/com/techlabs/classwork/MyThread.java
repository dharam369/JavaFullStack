package com.techlabs.classwork;

public class MyThread extends Thread{
	private String name;
	
	public MyThread(String name) {
		super(name);
		this.name=name;
	}

	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println(name+" : "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
