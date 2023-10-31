package com.sunbeam;

public class ReverseLinkedList {

	public static void main(String[] args) {

		List l1 = new List();
		l1.addFirst(10);
		l1.addFirst(20);
		l1.addFirst(30);
		l1.addFirst(40);
		System.out.println("Original List : ");
		l1.display();
		
		System.out.println("Original List : ");
		l1.reverseList();
		l1.display();
	}

}
