import java.util.*;
public class BinarySearchOnDescArray {

	public static boolean findKeyBinarySearch(int[] arr, int size, int key)
	{
		int left=0,right=size-1,mid;
		while(right>=left)
		{
			mid = (right+left)/2;
			if(arr[mid]==key)
			{
				return true;
			}
			else if(arr[mid]>key)
			{
				left = mid+1;
			}
			else
				right = mid-1;
		}
		return false;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int []arr = {98,78,45,65,60,42,35,25,12};
		
		System.out.println("Enter Key to search = ");
		int key = sc.nextInt();
		
		if(findKeyBinarySearch(arr,arr.length,key))
		{
			System.out.println("Element Found!!!");
		}
		else
			System.out.println("Element Not Found!!!");
		
	}

}
