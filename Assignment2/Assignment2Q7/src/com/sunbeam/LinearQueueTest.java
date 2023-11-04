package com.sunbeam;

import java.util.Arrays;
import java.util.Scanner;

class Queue
{
	private int front;
	private int rear;
	private int SIZE;
	private int arr[];
	
	public Queue(int size)
	{
		SIZE = size;
		arr = new int[SIZE];
		front = 0;
		rear = 0;
	}
	
	public void push(int data)
	{
		arr[rear] = data;
		rear++;
	}
	public int pop()
	{
		int data = arr[front];
		front++;
		return data;
				
	}
	public int peek()
	{
		return arr[front];
	}
	public boolean isFull()
	{
		return rear==SIZE;
	}
	public boolean isEmpty()
	{
		return rear==front;
	}
	public void display()
	{
		for(int i=front;i<rear;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
public class LinearQueueTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Queue q = new Queue(5);
		int choice;

		do
		{
			System.out.println("0.EXIT\n1.PUSH\n2.POP\n3.PEEK\n4.DISPLAY");
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
