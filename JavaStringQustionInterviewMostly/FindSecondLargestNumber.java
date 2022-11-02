package com.str;

import java.util.Arrays;

public class FindSecondLargestNumber {
	
	public static void getSecondLargestNumber(int arr[]) {
		if(arr.length>2) {
			Arrays.sort(arr);
			int arr1[]=new int[arr.length];
			int j=0;
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]!=arr[i+1]) {
					arr1[j++]=arr[i];
				}
			}
			System.out.println(arr1[j-1]);
		}else {
			System.out.println("Can not find Second Largest Element");
		}
		
		
	}
	
	public static void main(String[] args) {
		int arr[]= {1,4,32,44,44,3,22,53,53,53};
		getSecondLargestNumber(arr);
		
	
	}

}
