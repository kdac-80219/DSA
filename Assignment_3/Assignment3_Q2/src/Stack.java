import java.util.Arrays;

public class Stack {

	private int top;
	private int arr[];
	private final int SIZE ;
	private int max;
	public Stack(int size)
	{
		SIZE = size;
		top = -1;
		arr = new int[SIZE];
		max = arr[0];
	}
	
	public void push(int ele)
	{
		top++;
		arr[top] = ele;
		if(ele>max)
		{
			max = ele;
		}
	}
	
	public int pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is Empty!!!");
		}
		else
		{
			int data = arr[top];
			top--;
			return data;
		}
		return  -1;
		  
	}
	
	public int peek()
	{
		return arr[top];
	}
	
	public int maxElement()
	{
		return max;
	}
	
	public boolean isFull() 
	{
		if(top == SIZE-1)
		{
			return true;
		}
		else
			return false;
	}
	
	public boolean isEmpty() 
	{
		if(top == -1)
		{
			return true;
		}
		else
			return false;
	}
	
	public void display()
	{
		System.out.println(Arrays.toString(arr));
	}
	
}
