package com.sunbeam;

public class TestStackByDoublyLL {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		s.push(15);
		s.push(20);
		s.push(40);
		s.push(66);
		s.display();
		System.out.println("Top Element = "+s.peek());
		s.pop();
		s.display();
	}

}
