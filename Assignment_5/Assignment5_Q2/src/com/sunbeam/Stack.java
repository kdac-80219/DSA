package com.sunbeam;

public class Stack {

	List l1;
	
	public Stack()
	{
		l1 = new List();
	}
	
	public boolean isEmpty()
	{
		return l1.isEmpty();
	}
	
	public void push(int value)
	{
		l1.addFirst(value);
	}
	
	public void pop()
	{
		l1.deleteFirst();
	}
	
	public int peek()
	{
		return l1.getTopElement();
	}
	
	public void display()
	{
		l1.display();
	}
}
