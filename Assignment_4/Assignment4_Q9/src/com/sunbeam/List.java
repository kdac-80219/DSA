package com.sunbeam;

public class List {

	class Node
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
	
	public List()
	{
		head = null;
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
	
	public void maxElement()
	{
		int max = 0;
		if(isEmpty())
		{
			System.out.println("List is empty!!!");
			return ;
		}
		max = head.data;
		for(Node i=head;i!=null;i = i.next)
		{
			
			if(max<i.data)
			{
				max = i.data;
			}
		}
		System.out.println("Maximum = "+max);
	}
	
	public void minElement()
	{
		int min = 0;
		if(isEmpty())
		{
			System.out.println("List is empty!!!");
			return ;
		}
		min = head.data;
		for(Node i=head;i!=null;i = i.next)
		{
			
			if(min>i.data)
			{
				min = i.data;
			}
		}
		System.out.println("Maximum = "+min);
	}
	
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Empty");
			return;
		}
		
		Node trav = head;
		do
		{
			System.out.print(" "+trav.data);
			trav = trav.next;
		}while(trav!=null);
		System.out.println();
		
	}
}
