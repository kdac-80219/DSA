package com.sunbeam;

public class TestQueueByDoublyLL {

	public static void main(String[] args) {
		
		Queue q = new Queue();
		q.offer(45);
		q.offer(66);
		q.offer(82);
		q.offer(14);
		q.offer(33);
		q.display();
		
		System.out.println("After Poll :");
		q.poll();
		q.display();
		
		System.out.println("Top/First Element = "+q.peek());

	}

}
