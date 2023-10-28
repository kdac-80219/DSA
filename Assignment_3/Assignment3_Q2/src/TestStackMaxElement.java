import java.util.Scanner;

public class TestStackMaxElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Stack st = new Stack(5);
		int max,choice;
		
		do
		{
			System.out.println("0.EXIT\n1.PUSH\n2.POP\n3.PEEK.\n4.MAX FROM STACK\n5.DISPLAY STACK");
			System.out.println("Enter Your choice = ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1 : 
						  if(!st.isFull())
						  {
							  System.out.println("Enter Element in stack = ");
							  int element = sc.nextInt();
							  st.push(element);
							  System.out.println("Element pushed!!!!");
						  }
						  else
							  System.out.println("Stack is full!!!");
						 
						  break;
				case 2 :
						  if(!st.isEmpty())
						  {
							  int data = st.pop();
							  System.out.println("Element popped : "+data);
						  }
						  else
							  System.out.println("Stack is Empty!!!");
						 
						  break;
				case 3 : 
						  if(!st.isEmpty())
						  {
							  System.out.println("Element at TOP = "+st.peek());
						  }
						  else
							  System.out.println("Stack is Empty!!");
						 
						  break;
				case 4 :  System.out.println("Maximum Element From Stack = "+st.maxElement());
						  break;
				case 5 :  st.display();
						  break;
				default:  System.out.println("Wrong Choice!!!");
						  break;

			}
		}while(choice!=0);
		
		System.out.println("Thank You!!!");
	}

}
