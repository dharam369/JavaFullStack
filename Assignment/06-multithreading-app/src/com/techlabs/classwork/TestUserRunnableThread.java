package com.techlabs.classwork;

public class TestUserRunnableThread {

	public static void main(String[] args) throws InterruptedException {
System.out.println(Thread.currentThread());
		
		UserRunnableThread thread1=new UserRunnableThread("MyThread1"); // new/born state
		UserRunnableThread thread2=new UserRunnableThread("MyThread2"); // new/born state
		UserRunnableThread thread3=new UserRunnableThread("MyThread3"); // new/born state
		
		thread1.getT1().join();
		thread2.getT1().join();
		thread3.getT1().join();
		
		thread1.getT1().setPriority(1);
		thread2.getT1().setPriority(5);
		thread3.getT1().setPriority(10);
		
		
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
		
		System.out.println(thread1.getT1().getName());
		System.out.println("Run");
		

	}

}
