package com.str;

import java.util.Arrays;
import java.util.List;

public class CountNumberOfZerosAndOnes {
	
	public static void main(String[] args) {
		Integer[] arr ={1,0,1,1,0,0,0,1,1,1,0,1,0,1,1,0,1,0,0,0,1};
		
		List<Integer> l=Arrays.asList(arr);

		
//		int zero=0;
//		int ones=0;
//		for(int e:arr) {
//			if(e==0) {
//				zero++;
//			}
//			else {
//				ones++;
//			}
//		}
//		System.out.println("Ones="+ones+"   "+"Zeros="+zero);

		int sum=l.stream().reduce(0,Integer::sum);
		
		System.out.println("1s in the arrray="+sum);
		
		System.out.println("0s in the array="+(arr.length-sum));
		
	}

}
