package com.techlabs.queuetest;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		Queue<String> pq=new PriorityQueue<String>();
		pq.add("Radhe");
		pq.add("Shyam");
		pq.add("Mohan");
		pq.add("name");
		System.out.println("Initial Queue ::"+pq);
		pq.remove("name");
		System.out.println("After Remove Queue ::"+pq);
		System.out.println(pq.isEmpty());
		System.out.println(pq.contains("radhe"));
		System.out.println(pq.offer("mohan"));
		System.out.println(pq);
		System.out.println(pq.offer("raghav"));
		System.out.println(pq);
		System.out.println(pq.peek());    // only  retrieve
		System.out.println(pq);
		System.out.println(pq.poll());    //removes and retrieve
		System.out.println(pq);
		System.out.println(pq.peek());        // only  retrieve
		System.out.println(pq);
		System.out.println(pq.element());      // only  retrieve
		System.out.println(pq);
	}

}
