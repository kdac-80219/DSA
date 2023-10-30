package com.sunbeam;

import com.sunbeam.List.Node;

public class List {

	public class Node
	{
		private int data;
		private Node next;
		public Node(int value)
		{
			data = value;
			next = null;
		}
	}
	
	private Node tail;
	private int count;
	public List()
	{
		tail=null;
		count=0;
	}
	
	public boolean isEmpty()
	{
		return tail==null;
	}
	
	public void addFirst(int value)
	{
		Node newnode = new Node(value);
		
		if(isEmpty())
		{
			tail = newnode;
			newnode.next = newnode; 
		}
		else
		{
			newnode.next = tail.next;
			tail.next = newnode;
		}
		count++;
	}
	
	public void addLast(int value)
	{
		Node newnode = new Node(value);
		if(isEmpty())
		{
			tail = newnode;
			newnode.next = newnode;
		}
		else
		{
			newnode.next = tail.next;
			tail.next = newnode;
			tail = newnode;
		}
		count++;
	}
	
	public void addPosition(int value,int pos)
	{
		if(pos < 1 || pos > count+1)
			return;
		
		Node newnode = new Node(value);
		
		if(isEmpty()) {
			tail = newnode;
			tail.next = tail;
		}
		else if (pos == 1) {
			addFirst(value);
			return;
		}
		else {
			
			Node trav = tail;
			for(int i = 1 ; i < pos - 1 ; i++)
				trav = trav.next;
			newnode.next = trav.next;
			trav.next = newnode;
		}
	}
	
	public void deleteFirst()
	{
		if(isEmpty())
		{
			System.out.println("List is Empty!!!!");
		}
		else
		{
			tail.next = tail.next.next;
		}
	}
	public void deleteLast()
	{
		if(isEmpty())
		{
			System.out.println("List is Empty!!!!");
		}
		else
		{
			Node trav = tail;
			do
			{
				trav = trav.next;
			}while(trav.next!=tail);
			
			tail = trav;
			tail.next = trav.next.next;
		}
	}
	
	public void deletePosition(int pos)
	{
		if(pos < 1 || pos > count+1)
			return;
		
		Node newnode = new Node(pos);
		
		if(isEmpty()) {
			System.out.println("List is empty!!!!");
			return;
		}
		else if (pos == 1) {
			deleteFirst();
			return;
		}
		else if(tail.next == tail)
		{
			tail=null;
		}
		else {
			
			Node trav = tail;
			for(int i = 1 ; i < pos - 1 && trav.next.next!=tail ; i++)
				trav = trav.next;
			trav.next = trav.next.next;
		}
	}
	
	public void display()
	{
		if(isEmpty())
			return;
		System.out.print("List : ");
		Node trav = tail;
		do {
			trav = trav.next;
			System.out.print("  " + trav.data);
		}while(trav != tail);
		System.out.println("");
	}
}
