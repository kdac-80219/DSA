package com.sunbeam;

public class List {

	public class Node
	{
		private int data;
		private Node next;
		private Node prev;
		
		public Node(int value)
		{
			data = value;
			next = null;
			prev = null;
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
			head.next = newnode;
			head.prev = newnode;
		}
		else if(head.next==head)
		{
			newnode.next = head;
			newnode.prev = head;
			head.next = newnode;
			head.prev = newnode;
			head = newnode;
		}
		else
		{
			newnode.next = head;
			newnode.prev = head.prev;
			head.prev.next = newnode;
			head.prev = newnode;
			head = newnode;
			
		}
		
	}
	
	public void addLast(int value)
	{
		Node newnode = new Node(value);
		if(isEmpty())
		{
			head = newnode;
			head.next = head;
			head.prev = head;
		}
		else
		{
			head.prev.next = newnode;
			newnode.prev = head.prev;
			newnode.next = head;
			head.prev = newnode;
		}
	}
	
	public void addAtPosition(int val,int pos)
	{
		Node newnode = new Node(val);
		Node trav = head;
		if(isEmpty())
		{
			addFirst(val);
		}
		else if(pos==1)
			addFirst(val);
		else 
		{
			for(int i=1;i<pos-1;i++)
			{
				trav = trav.next;
			}
			
			newnode.prev = trav;
			newnode.next = trav.next;
			trav.next.prev = newnode;
			trav.next = newnode;
			
		}
	}
	
	public void deleteAtPosition(int pos)
	{
		Node trav = head;
		if(isEmpty())
		{
			System.out.println("List Empty");
			return;
		}
		else if(head.next==head)
		{
			head=null;
		}
		else if(pos<=1)
			deleteFirst();
		else
		{
			for(int i=1;i<pos-1;i++)
			{
				trav = trav.next;
			}
			
			trav.next = trav.next.next;
			trav.next.next.prev = trav;

		}
	}
	public void deleteFirst()
	{
		if(isEmpty())
		{
			System.out.println("List Empty");
			return;
		}
		else
		{
			head.prev.next = head.next;
			head.next.prev = head.prev;
			head = head.next;
		}
	}
	
	public void deleteLast()
	{
		if(isEmpty())
		{
			System.out.println("List Empty");
			return;
		}
		
		else
		{
			head.prev.prev.next = head;
			head.prev=head.prev.prev;
		}
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
		}while(trav!=head);
		System.out.println();
	}
}
