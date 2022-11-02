package com.str;

public class StringPalindrom {
	public static void main(String[] args) {
		String str="bababa";
		
		String str1="";
		
		for(int i=str.length()-1;i>=0;--i) {
			
			str1=str1+str.charAt(i);
			System.out.println(str.charAt(i));
		}
		System.out.println(str);
		System.out.println(str1);
		if(str.equals(str1)) {
			System.out.println(str +" Is a Palindrom String");
		}else {
			System.out.println(str+" Is not palindrom ");
		}
		
	}

}
