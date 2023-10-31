package com.sunbeam;

public class TestLinkedList {

	public static void main(String[] args) {
		
		List l1 = new List();
		l1.addFirst(10);
		l1.addFirst(20);
		l1.display();
		l1.addLast(5);
		l1.display();
		l1.deleteFirst();
		l1.display();
		l1.deleteLast();
		l1.display();
		l1.addFirst(50);
		l1.addFirst(60);
		l1.addFirst(70);
		l1.addFirst(80);
		l1.display();

		l1.addAtPosition(99, 3);
		l1.display();
		
		l1.deleteAtPosition(3);
		l1.display();
	}

}
