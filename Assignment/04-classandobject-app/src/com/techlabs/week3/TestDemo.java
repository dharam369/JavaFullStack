package com.techlabs.week3;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo demo1=new Demo();
		Demo demo2=new Demo();
		Demo demo3=new Demo();
		demo1.Display();
		demo2.Display();
		demo3.Display();
		
		demo1.Increment();
		demo1.Display();

		demo2.Increment();
		demo2.Display();
		demo3.Increment();
		demo3.Display();
		
		demo1.Display();
		demo2.Display();
		demo3.Display();
	}
	static {
		System.out.println("DemoTest static block1");
	}

}