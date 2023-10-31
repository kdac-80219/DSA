package com.sunbeam;

public class CirculrLLTest {

	public static void main(String[] args) {
		
		CircularList c = new CircularList();
		
		c.addFirst(10);
		c.addFirst(20);
		c.addFirst(30);
		c.addFirst(40);
		c.addLast(99);
		c.addLast(77);
		c.display();
		c.deleteFirst();
		c.display();
		c.deleteLast();
		c.display();
		c.addAtPos(140, 3);
		c.display();
		c.deleteAtPos(4);
		c.display();
	}

}
