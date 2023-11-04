package com.sunbeam;

public class BSTree 
{

	public class Node
	{
		private int data;
		private Node right;
		private Node left;
		
		public Node(int value)
		{
			data = value;
			right=null;
			left = null;
		}
	}
	private Node root;
	public BSTree()
	{
		root=null;
	}
	
	public boolean isEmpty()
	{
		return root==null;
	}
	
	public Node addNode(int value)
	{
		Node newnode = new Node(value);
		if(isEmpty())
		{
			root = newnode;
		}
		else
		{
			Node trav = root;
			
				if(trav.left==null)
				{
					trav.left = addNode(value);
					break;
				}
				else
				{
					if(trav.right==null)
					{
						trav.right = addNode(value);
						break;
					}
				}
		}
	  }
	return null;
}
}
	
	public void InOrder(Node trav)
	{
		if(trav==null)
			return;
		
		InOrder(trav.left);
		System.out.print(" "+trav.data);
		InOrder(trav.right);
	}
	
	public void InOrder()
	{
		System.out.println("InOrder : ");
		InOrder(root);
	}
}
