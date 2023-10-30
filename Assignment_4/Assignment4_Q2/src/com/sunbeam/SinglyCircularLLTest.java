package com.sunbeam;

public class SinglyCircularLLTest {

	public static void main(String[] args) {

		List l1 = new List();
		
		l1.addFirst(10);
		l1.addFirst(20);
		l1.addFirst(30);
		l1.addFirst(40);
		l1.display();
		System.out.println("AFTER addLast:");
		l1.addLast(55);
		l1.display();
		l1.deleteFirst();
		System.out.println("After Delete :");
		l1.display();
		System.out.println("After Delete at Last :");
		l1.deleteLast();
		l1.display();
		
		System.out.println("After Adding at Position :");
		l1.addPosition(99, 4);
		l1.display();
		
		System.out.println("After Deleting at Position :");
		l1.deletePosition(4);
		l1.display();
	}

}
