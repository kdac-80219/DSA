package com.sunbeam;

import java.util.Scanner;

public class LinearQueueImplementation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinearQueue q=new LinearQueue(5);
		 
		int choice;
		do {
			System.out.println("0.Exit");
			System.out.println("1.Add Data");
			System.out.println("2.Poll Data");
			System.out.println("3.Peek Element");
			System.out.println("Enter choice");
			choice=sc.nextInt();
			
			switch (choice) {
			case 1:	if(q.isFull())
					System.out.println("Stack is full");
					else
						{
						System.out.println("Enter data");
			            int data=sc.nextInt();
						q.insert(data);
						}
				break;
			case 2: if(q.isEmpty())
					System.out.println("Stack is Empty");
	        		else
	        			System.out.println("Value Poped");
				break;
			case 3: System.out.println("Peek Value: "+q.peek());
				
				break;
			default:
				break;
			}
		}
		while(choice!=0);
	}

}