package com.str;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartWithOne {
	public static void main(String[] args) {
		
		List<Integer> l=Arrays.asList(1,12,23,34,14,18,60);
		
		List<String> li=l.stream()
		.map(e->e+"").filter(e->e.startsWith("1")).collect(Collectors.toList());
		System.out.println(li);
	}

}
