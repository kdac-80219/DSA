package com.sunbeam;

public class TestDoubleLL {

	public static void main(String[] args) {
		
		List l1 = new List();
		l1.addFirst(10);
		l1.addFirst(20);
		l1.addFirst(60);
		l1.addFirst(50);
		l1.display();
		l1.addLast(99);
		l1.display();
		
		System.out.println("After deleteFirst :");
		l1.deleteFirst();
		l1.display();
		
		System.out.println("After deleteLast :");
		l1.deleteLast();
		l1.display();
		
		System.out.println("After Add At Position :");
		l1.addAtPosition(111,3);
		l1.display();
		
		System.out.println("After Delete At Position :");
		l1.deleteAtPosition(1);
		l1.display();
	}

}
