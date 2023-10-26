import java.util.*;
public class NonRepeatingElementSearch {

	public static int findNonRepeatingElement(int[] arr)
	{
		int count = 0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count>1)
			{
				return arr[i];
			}
			
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []arr = new int[10];
		
		System.out.println("Enter elements : ");
		for(int i=0;i<10;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int repeatingElement = findNonRepeatingElement(arr);
		
		if(repeatingElement==0)
		{
			System.out.println("No repeating element found!!");
		}	
		else
			System.out.println("First Reapeating Element from array =  "+repeatingElement);

			
	}

}
