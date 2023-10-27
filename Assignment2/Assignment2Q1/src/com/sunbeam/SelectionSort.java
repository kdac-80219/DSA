package com.sunbeam;

import java.util.Arrays;

public class SelectionSort {
	public static int SelectionSortMethod(int arr[])
	{
		int comparisions=0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				comparisions++;
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return comparisions;
	}
	public static void main(String[] args) {
		int arr[]= {52,42,75,65,35,10,45,95};
		int noOfComparaision=SelectionSortMethod(arr);
		System.out.println("Number of comaparions: "+noOfComparaision);
		System.out.println(Arrays.toString(arr));
	}

}
