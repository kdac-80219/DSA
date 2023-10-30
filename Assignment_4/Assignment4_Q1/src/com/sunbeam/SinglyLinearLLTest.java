package com.sunbeam;

public class SinglyLinearLLTest {

	public static void main(String[] args) {
		List l = new List();
		l.addFirst(40);
		//40
		l.addFirst(30);
		//30->40
		l.addFirst(20);
		//20->30->40
		l.addFirst(10);
		//10->20->30->40
		l.addLast(50);
		//10->20->30->40->50
		//l1.deleteFirst();
		//20->30->40->50
		//l1.deleteLast();
		//20->30->40
		//l1.addPosition(60, 7);
		//l.deletePosition(3);
		l.display();
		//l.deleteFirst();
		l.deleteLast();
		l.display();
		

		//l.deleteAll();
	}

}
