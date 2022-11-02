package com.str;

public class PalindromNumber {
	
	public static void main(String[] args) {
		
		int remainder=0,reverseNumber=0;
		int num=546; 
		int temp=num;
		while(temp>0) {
			
			remainder=temp%10;
			reverseNumber=reverseNumber*10 +remainder;
			temp=temp/10;
		}
		if(num==reverseNumber) {
			System.out.println(num + " Number is Palindrom");
		}
		else {
			System.out.println(num + " Num ber is not Plindrom");
		}
		
	}

}
