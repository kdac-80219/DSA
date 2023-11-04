package com.sunbeam;

import java.util.Scanner;

class Queue2
{
	private int front;
	private int rear;
	private int SIZE;
	private int arr[];
	private int counter;
	
	
	
	public Queue2(int size)
	{
		SIZE = size;
		arr = new int[SIZE];
		front = -1;
		rear = -1;
		counter=0;
	}
	
	public void push(int data)
	{
		rear = (rear+1)%SIZE;
		arr[rear] = data;
	}
	
	public int pop()
	{
		front = (front+1)%SIZE;
		int ele = arr[front];
		if(front==rear)
			front=rear=-1;
		return ele;
	}
	public int peek()
	{
		return arr[(front+1)%SIZE];
	}
	
	public boolean isFull()
	{
		return (front == rear && rear != -1) || (front == -1 && rear == SIZE - 1);
	}
	public boolean isEmpty()
	{
		return (front==rear && rear==-1);
	}
	
	public void display()
	{
		if(rear!=-1)
		{
			for(int i=front+1;i<=rear;i++)
			{
				System.out.print(arr[i]+",");
			}
		}
	}
	/*
	public void push(int data)
	{
		rear = (rear+1)%SIZE;
		arr[rear] = data;
		counter++;
	}
	public int pop()
	{			
		front = (front+1)%SIZE;
		int data = arr[front];
		if(front == rear)
			front = rear = -1;
		counter--;
		return data;
	}
	public int peek()
	{
		return arr[(front+1)%SIZE];
	}
	public boolean isFull()
	{
		//return (front == rear && rear != -1) || (front == -1 && rear == SIZE - 1);
		return counter==SIZE;
	}
	public boolean isEmpty()
	{
		//return (front==rear && rear==-1);
		return counter==0;
	}
	public void display()
	{
		if(rear!=-1)
		{
			for(int i=front+1;i<=rear;i++)
			{
				System.out.print(arr[i]+",");
			}
		}
		else
			System.out.println("Queue is empty!!!");
				/*
		if(front>=0)
		{
			for(int i=front;i>=0;i--)
			{
				System.out.print(arr[i]+",");
			}
		}
		if(rear>=0)
		{
			for(int i=0;i<SIZE;i++)
			{
				System.out.print(arr[i]+",");
			}
		}
		
		
	}
    */
}
public class CircularQueueUsingCounter {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Queue2 q = new Queue2(5);
		int choice;

		do
		{
			System.out.println("\n0.EXIT\n1.PUSH\n2.POP\n3.PEEK\n4.DISPLAY");
			System.out.println("Enter your choice = ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1: 
					if(!q.isFull())
					{
						System.out.println("Enter element = ");
						int element = sc.nextInt();
						q.push(element);
						System.out.println("Element pushed!!!!");
					}
					else
						System.out.println("Queue is full!!!!");
					break;
			case 2:
					if(!q.isEmpty())
					{
						System.out.println("Element Popped = "+q.pop() );
					}
					else
						System.out.println("Queue is empty!!!");
					break;
			case 3: 
					if(!q.isEmpty())
					{
						System.out.println("Top/First Element = "+q.peek());
					}
					else
						System.out.println("Queue is empty!!!");
					break;
			case 4: q.display();
					break;
			default : System.out.println("Wrong choice!!");
					  break;
			}
		}while(choice!=0);
		
		System.out.println("Thank You... :)");
	}

}
