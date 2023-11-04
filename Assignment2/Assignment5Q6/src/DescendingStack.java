package com.sunbeam;

import java.util.Scanner;

class Stackdesc
{
	private final int SIZE;
	private int top;
	private int arr[];
	
	public Stackdesc(int size) {
		SIZE = size;
		top=SIZE;
		arr = new int[SIZE];
	}
	
	public void  push(int data)
	{
		top--;
		arr[top] = data;
	}
	public int pop()
	{
		int ele = arr[top];
		top++;
		return ele;
	}
	public int peek()
	{
		return arr[top];
	}
	
	public boolean isFull()
	{
		return top==0;
	}
	public boolean isEmpty()
	{
		return top==SIZE;
	}
	
	public void display()
	{
		for(int i=top;i<SIZE;i++)
		{
			System.out.print(arr[i]+",");
		}
	}
}
public class DescendingStack {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Stackdesc st = new Stackdesc(5);
		int choice;

		do
		{
			System.out.println("\n0.EXIT\n1.PUSH\n2.POP\n3.PEEK\n4.DISPLAY");
			System.out.println("Enter your choice = ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1: 
					if(!st.isFull())
					{
						System.out.println("Enter element = ");
						int element = sc.nextInt();
						st.push(element);
						System.out.println("Element pushed!!!!");
					}
					else
						System.out.println("Queue is full!!!!");
					break;
			case 2:
					if(!st.isEmpty())
					{
						System.out.println("Element Popped = "+st.pop() );
					}
					else
						System.out.println("Queue is empty!!!");
					break;
			case 3: 
					if(!st.isEmpty())
					{
						System.out.println("Top/First Element = "+st.peek());
					}
					else
						System.out.println("Queue is empty!!!");
					break;
			case 4: st.display();
					break;
			default : System.out.println("Wrong choice!!");
					  break;
			}
		}while(choice!=0);
		
		System.out.println("Thank You... :)");
	}


}
