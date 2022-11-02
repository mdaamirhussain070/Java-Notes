package com.str;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingHashMapBasedOnValues {
	public static void main(String[] args) {
		
		HashMap<String,Integer> map=new HashMap<>();
		map.put("a", 2);
		map.put("b",5);
		map.put("c", 1);
		
		LinkedHashMap<String,Integer> sortedmap=map.entrySet().stream().sorted((i1,i2)->{
			return i1.getValue()-i2.getValue();
		})
		.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
	
	System.out.println(map);
	System.out.println(sortedmap);
	
	LinkedHashMap<String,Integer> sortedmap1=map.entrySet().stream().sorted(Map.Entry.comparingByValue())
	.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
	
	System.out.println(sortedmap1);
	}


}
