package com.techlabs.classwork;

public class MyThreadTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(Thread.currentThread());
		
		MyThread thread1=new MyThread("MyThread1"); // new/born state
		MyThread thread2=new MyThread("MyThread2"); // new/born state
		MyThread thread3=new MyThread("MyThread3"); // new/born state
		thread1.start();  //Runnable
		thread2.start();
		thread3.start();
		
		thread1.join();
		thread2.join();
		thread3.join();
		
		System.out.println("Run1");
		
		
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" :"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(thread1.getName());
		System.out.println("Run");
		
	}

}
