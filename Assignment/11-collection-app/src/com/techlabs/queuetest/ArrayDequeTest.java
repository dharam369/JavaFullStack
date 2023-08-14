package com.techlabs.queuetest;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ArrayDequeTest {

	public static void main(String[] args) {
		Queue<String> q=new ArrayDeque<String>();
	//	System.out.println(q.remove()); //::-> Exception in thread "main" java.util.NoSuchElementException
		System.out.println(q.poll());   //::-> null
		System.out.println(q.peek());
		q.add("Raghav");
		q.add("Mohan");
		System.out.println(q);
		
		Deque<String> dq=new ArrayDeque<String>();
		//	System.out.println(q.remove()); //::-> Exception in thread "main" java.util.NoSuchElementException
			System.out.println(dq.poll());   //::-> null
			System.out.println(dq.peek());
			dq.add("Raghav");
			dq.add("Mohan");
			System.out.println(dq);
		
		
	}

}
