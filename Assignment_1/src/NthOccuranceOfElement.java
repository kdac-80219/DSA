import java.util.*;
public class NthOccuranceOfElement {

	public static int NthOccurancceLinearSearch(int[] arr, int size, int element)
	{
		int lastOccurance=0;
		for(int i=0;i<size;i++)
		{
			if(arr[i]==element)
			{
				lastOccurance=i;
			}
		}
		
		if(lastOccurance==0)
			return -1;
		else
			return lastOccurance;
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int []arr =  new int[10];
		
		System.out.println("Enter array elements :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter element to find its last occurance = ");
		int num = sc.nextInt();
		int lastOccuranceIndex = NthOccurancceLinearSearch(arr,arr.length,num);
		
		if(lastOccuranceIndex==-1)
		{
			System.out.println("Element not found!!!");
		}
		else
			System.out.println("Element last occrance of element "+num+" is at index "+lastOccuranceIndex);

	}

}
