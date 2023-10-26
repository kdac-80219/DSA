import java.util.*;
public class RankOfElement {
	
	public static int findRankOfElement(int[] arr, int size, int element)
	{
		int count=0;
		for(int i=0;i<size;i++)
		{
			if(arr[i]==element)
			{
				count++;
			}
			else if(arr[i]<element)
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int []arr = new int[5];
		System.out.println("Enter elements :");
		for(int i =0;i<5;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter element to find its rank = ");
		int element = sc.nextInt();
		
		int rank = findRankOfElement(arr,arr.length,element);
		
		System.out.println("Rank of "+element+" = "+rank);
	}

}
