package com.str;

public class SumSubArray {
	public static void main(String[] args) {
		// {1,2,3}
		// k=3
		// find number of sub array whose sum is equal to k
		
		int arr[]= {1,2,3,3,1,2,1,1,1};
		int k=3;
		int size=arr.length;
		int result=0;
		
		for(int i=0;i<size;i++) {
			int sum=0;
			for(int j=i;j<size;j++) {
				sum=sum+arr[j];
				if(sum==k) {
					result++;
				}
			}
			
		}
		System.out.println("Number of sub array whose sum is "+k+" = "+result);
	}

}
