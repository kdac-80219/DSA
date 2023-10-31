package com.sunbeam;

public class MiddleOfLinkedList {


	public static void main(String[]args)
	{
		List2 l1 = new List2();
		l1.addFirst(10);
		l1.addFirst(20);
		l1.addFirst(30);
		l1.addFirst(40);
		l1.addFirst(50);
		l1.addFirst(60);
		l1.addFirst(70);
		l1.addFirst(80);
		l1.display();
		l1.findMiddle();
	}
}
