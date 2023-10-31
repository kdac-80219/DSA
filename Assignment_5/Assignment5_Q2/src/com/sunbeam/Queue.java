package com.sunbeam;

public class Queue {

	List l1;
	
	public Queue()
	{
		l1 = new List();
	}
	
	public boolean isEmpty()
	{
		return l1.isEmpty();
	}
	
	public void offer(int value)
	{
		l1.addFirst(value);
	}
	
	public void poll()
	{
		l1.deleteLast();
	}
	
	public int peek()
	{
		return l1.getFirstElementforQueue();
	}
	
	public void display()
	{
		l1.display();
	}
}
