package com.str;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartAndEndWithSameCharacter {
	
	public static void main(String[] args) {
		String[] arr= {"aba","aaa","cde","def","cdddddd","liril","ac"};
		
		
	   List<String> l=Arrays.asList(arr);
	   
	   l.stream()
	   //.filter(e->e.charAt(0)==e.charAt(e.length()-1))
	   .filter(e->e.length()>0 && e.endsWith(e.valueOf(e.charAt(0))))
	   .forEach(e->System.out.println(e));
	 //  .collect(Collectors.toList());
	   
	   
	}

}
