import java.util.Arrays;

public class Stack {

	private int arr[];
	private int reverseArr[];
	private int top;
	private final int SIZE;
	
	public Stack(int size)
	{
		SIZE = size;
		arr = new int[SIZE];
		top = -1;
	}
	
	public void push(int data)
	{
		top++;
		arr[top] = data;	
	}
	
	public int pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			int data = arr[top];
			top--;
			return data;
		}
		return -1;
	}
	
	public int peek()
	{
		return arr[top];
	}
	
	public boolean isFull()
	{
		return top == SIZE - 1; 
	}
	
	public boolean isEmpty()
	{
		return top == - 1; 
	
	}
	
	public void displayOriginalArray()
	{
		System.out.println("Original Array = \n"+Arrays.toString(arr));
	}
	public void displayReversedArray()
	{
		System.out.println("Reversed Array = \n"+Arrays.toString(reverseArr));
	}
	
}
