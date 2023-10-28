import java.util.Arrays;
import java.util.Scanner;

class Queue
{
	private int arr[];
	private int SIZE;
	private int front;
	private int rear;
	
	public Queue(int size)
	{
		SIZE = size;
		rear = -1;
		front = -1;
		arr = new int[SIZE];
	}
	
	public void push(int data)
	{
		rear++;
		arr[rear]  = data;
	}
	public int  pop()
	{
		front++;
		return  arr[front];
	}
	public int peek()
	{
		return arr[front++];
	}
	
	public boolean isEmpty()
	{
		if(rear==front)
			return true;
		else
			return false;
	}
	
	public boolean isFull()
	{
		if(rear==SIZE-1)
			return true;
		else
			return false;
	}
	
	public void display()
	{
		System.out.println(Arrays.toString(arr));
	}
}
public class StackUsingQueue {

	public static void main(String[] args) {
		Queue q = new Queue(5);
		int choice;
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("0.EXIT\n1.PUSH\n2.POP\n4.DISPLAY STACK");
			System.out.println("Enter Your choice = ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			
			case 1 : 
					if(!q.isFull())
					{
						System.out.println("Enter Element : ");
						int element = sc.nextInt();
						q.push(element);
						System.out.println("Element Pushed!!!!");
					}
					else
						System.out.println("Full!!!!");
					
					break;
					
			case 2 : 
					if(!q.isEmpty())
					{
						int data = q.pop();
						System.out.println("Element Poped = "+data);
					}
					else
						System.out.println("Empty!!!");
		
					break;
			
			case 3 :
					System.out.println("Top Element = "+q.peek());
					break;
			case 4 : q.display();
					break;
			default: System.out.println("Wrong Choice!!!!");
			 		 break;
			}
		}while(choice!=0);
		System.out.println("Thank You!!!!");
	}

}
