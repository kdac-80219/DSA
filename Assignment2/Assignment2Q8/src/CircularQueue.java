
public class CircularQueue {
	private int arr[];
	private final int SIZE;
	private int rear,front;
	private int counter;
	
	public CircularQueue(int size) {
		SIZE=size;
		arr=new int[SIZE];
		front=-1;
		rear=-1;
		counter=0;
	}
	
	public void insert(int data)
	{
		counter++;
		rear++;
		arr[rear]=data;
	}
	
	public void delete()
	{
		front++;
		counter--;
	}
	
	public int peek()
	{
		return arr[front+1];
	}
	
	public boolean isEmpty()
	{
		if(counter==0)
			return true;
		return false;
	}
	
	public boolean isFull()
	{
		if(counter==SIZE-1)
			return true;
		return false;
	}
}