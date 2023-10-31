package com.sunbeam;

public class TestSinglyLLBubbleSort {

	public static void main(String[] args) {
		
		List l1 = new List();
		l1.addFirst(40);
		l1.addFirst(22);
		l1.addFirst(10);
		l1.addFirst(80);
		System.out.println("Normal Display :");
		l1.display();
		
		System.out.println("Sorted Display :");
		l1.bubbleSortList();
		l1.display();

	}

}
