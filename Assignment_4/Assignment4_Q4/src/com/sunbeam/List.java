package com.sunbeam;


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
	
	private Node head;
	private Node t1;
	private Node t2;
	public List()
	{
		head = null;
		t1 = null;
		t2 = null;
	}
	
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public void addFirst(int value)
	{
		Node newnode = new Node(value);
		if(isEmpty())
		{
			head = newnode;
		}
		else
		{
			newnode.next = head;
			head = newnode;
		}
	}
	
	public void reverseList()
	{
		t1 = head;
		t2 = head.next;
		head.next = null;
		while(head!=null)
		{
			head = t2.next;
			t2.next = t1;
			t1=t2;
			t2 = head;
		}
		head = t1;
	}
	
	public void display()
	{
		Node trav = head;
		
		while(trav!=null)
		{
			System.out.print(" "+trav.data);
			trav = trav.next;
		}
		System.out.println();
	}
}
