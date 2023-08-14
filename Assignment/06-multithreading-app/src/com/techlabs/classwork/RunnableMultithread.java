package com.techlabs.classwork;

public class RunnableMultithread implements Runnable {
	private String name;

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

	public RunnableMultithread(String name) {
		super();
		this.name = name;
	}

}
