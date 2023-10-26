import java.util.Scanner;

public class Assignment1_Q1 {

	
	public static int linearSearch(int[] arr, int size, int key)
	{
		System.out.println("Into Linear");
		int count1=0;
		for(int i=0;i<size;i++)
		{
			if(arr[i]==key)
			{
				return count1;
			}
			count1++;
		}
		return count1;
	}
	public static int binarySearch(int[] arr2, int size, int key)
	{
		System.out.println("Into Binary");

		int count2=0;
		int left=0,right=size-1,mid;
		while(left<=right)
		{
			mid = (right+left)/2;
			if(key==arr2[mid])
			{
				return count2++;
			}
			else if(key<arr2[mid])
			{
				right = mid-1;
			}
			else
				left = mid+1;
			count2++;
		}
		return count2;
		
	}
	public static void main(String[] args) {
		
		int [] arr = {98,54,15,44,74,34,66};
		int [] arr2 = {11,44,66,77,99,111,142};
		int compCountLinear,compCountBinary,key;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a key to search = ");
		key = sc.nextInt();
		
		compCountLinear = linearSearch(arr,arr.length,key);
		
		if(compCountLinear==0)
		{
			System.out.println("Key not found!!!");
		}
		else
		{
			System.out.println("Total Comparisons in Linear Search = "+compCountLinear);
		}
		
		
		compCountBinary = binarySearch(arr2,arr2.length,key);

		if(compCountBinary==0)
		{
			System.out.println("Key not found!!!");
		}
		else
		{
			System.out.println("Total Comparisons in Binary Search = "+compCountBinary);
		}
		
		
	}

}
