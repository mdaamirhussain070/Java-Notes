package com.str;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCount {
	
	public static void getFrequencyCount(int arr[]) {
		
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
	
		//		HashMap<Integer,Integer> sortedmap=map.entrySet().stream()
//				.sorted((i1,i2)->i1.getKey().compareTo(i2.getKey()))
//				.collect(Collectors.toMap((Map.Entry::getKey), Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
//	
		ArrayList<Integer> arraylist= new ArrayList<Integer>(map.keySet());
		Collections.sort(arraylist);
		
		for(Integer x:arraylist) {
			System.out.println("Key  "+x+" "+ "Value  " +map.get(x));
		}
		
		
//		for(Map.Entry<Integer, Integer> entry:sortedmap.entrySet()) {
//			System.out.println(entry.getKey()+"   "+ entry.getValue());
		}
	
	
		
	public static void getFrequencyCountMap(List<String> l) {
			
			Map<String,Integer> map2=new HashMap<>();
			
			l.forEach(e->System.out.println(e));
			l.forEach(e->{
				if(map2.containsKey(e)) {
					map2.put(e,map2.get(e)+1);
				}
				else {
					map2.put(e, 1);
				}
			});
			
			map2.forEach((k,v)->System.out.println(k+"   "+v));
		}
	
	public static void getDistnict(List l) {
		List l2=(List) l.stream()
		.map(e-> e.toString().toUpperCase())
		.distinct()
		.sorted()
		.collect(Collectors.toList());
		
		l2.forEach(e-> System.out.println(e));
	}
			
	public static void main(String[] args) {
		
	//	int arr[]= {10,20,10,30,10,20,30,1,3,3,3,3,7};
		
		List<String> l=Arrays.asList("apple","banana","gavava","watermilon","apple","apple","banana");
		
//		getFrequencyCount(arr);
		getFrequencyCountMap(l);
		getDistnict(l); 
		
	}

	
}
