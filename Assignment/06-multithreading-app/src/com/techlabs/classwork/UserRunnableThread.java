package com.techlabs.classwork;

public class UserRunnableThread implements Runnable{
	private String name;
	private Thread t1;
	

	public Thread getT1() {
		return t1;
	}

	public UserRunnableThread(String name) {
		t1=new Thread(this);
		t1.start();
		this.name = name;
	}


	@Override
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
