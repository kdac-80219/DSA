package com.sunbeam;

public class List2 {

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
	private Node fast;
	private Node slow;
	public List2()
	{
		head = null;
		fast = null;
		slow = null;
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
	public void findMiddle()
	{
		fast = head;
		slow = head;
		if(isEmpty())
		{
			System.out.println("Empty");
			return;
		}
		do
		{
			fast = fast.next.next;
			slow = slow.next;
		}
		while(fast.next!=null && fast.next.next!=null);
		System.out.println("Middle Node = "+slow.data);
		
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
