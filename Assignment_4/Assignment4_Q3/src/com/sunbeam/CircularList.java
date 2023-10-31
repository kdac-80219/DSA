package com.sunbeam;

public class CircularList {

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
	
	Node head;
	public CircularList() {
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
			newnode.next = newnode;
		}
		else
		{
			newnode.next = head;
			
			Node trav = head;
			
			while(trav.next!=head)
			{
				trav = trav.next;
			}
			trav.next = newnode;
			head = newnode;
		}
	}
	
	public void addLast(int value)
	{
		Node newnode = new Node(value);
		
		if(isEmpty())
		{
			head = newnode;
			newnode.next = newnode;
		}
		else
		{
			Node trav = head;
			
			while(trav.next!=head)
			{
				trav = trav.next;
			}
			trav.next = newnode;
			newnode.next = head;
		}
	}
	
	public void addAtPos(int value,int pos)
	{
		Node newnode = new Node(value);
		
		if(isEmpty())
		{
			head = newnode;
			head.next = head;
		}
		else
		{
			Node trav = head;
			for(int i=1;i<pos-1;i++)
			{
				trav = trav.next;
			}
			
			newnode.next = trav.next;
			trav.next = newnode;
			
		}
	}
	public void deleteFirst()
	{
		if(isEmpty())
		{
			System.out.println("List Empty");
		}
		else if(head.next == head)
		{
			head = null;
		}
		else
		{
			Node trav = head;
			while(trav.next!=head)
			{
				trav = trav.next;
			}
			trav.next = head.next;
			head = head.next;
		}
	}
	
	public void deleteLast()
	{
		if(isEmpty())
		{
			System.out.println("List Empty");
		}
		else if(head.next == head)
		{
			head = null;
		}
		else
		{
			Node trav = head;
			while(trav.next.next != head)
			{
				trav = trav.next;
			}
			trav.next = trav.next.next;
		}
	}
	
	public void deleteAtPos(int pos)
	{
		if(isEmpty())
		{
			System.out.println("List Empty");
			return;
		}
		else if(head.next == head)
		{
			head = null;
		}
		else
		{
			Node trav = head;
			for(int i=1;i<pos-1;i++)
			{
				trav = trav.next;
			}
			trav.next = trav.next.next;
		}
	}
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("List Empty");
			return;
		}
		else
		{
			Node trav = head;
			
			do
			{
				System.out.print(" "+trav.data);
				trav = trav.next;
			}while(trav!=head);
			System.out.println();
			
		}
	}

}
