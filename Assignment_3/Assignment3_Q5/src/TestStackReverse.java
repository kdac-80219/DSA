import java.util.Arrays;
import java.util.Scanner;

public class TestStackReverse {

	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Stack = ");
		size = sc.nextInt();
		Stack st = new Stack(size);
		int reverseArr[] = new int [size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter Element to add = ");
			int element = sc.nextInt();
			st.push(element);
		}
	
		st.displayOriginalArray();
		
		for(int i=0;i<size;i++)
		{
			reverseArr[i] = st.pop();
		}
		System.out.println("Reversed Array = \n"+Arrays.toString(reverseArr));
//		
//		st.displayReversedArray();

	}

}
