package com.str;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator;

public class HashMapTravesal {
	
	public static void main(String[] args) {
		
		
		
		IdentityHashMap<Integer,String> ihmap=new IdentityHashMap<>();
		  
		
		ihmap.put(1, "geeks");
		ihmap.put(2, "5");
		ihmap.put(3, "cool");
		ihmap.put(4, "hot");
		ihmap.put(5, "freez");
		
		Iterator<Entry<Integer,String>> it=(Iterator) ihmap.entrySet().iterator();
	
		 
		 while(it.hasNext()) {
			 IdentityHashMap.Entry<Integer,String> entry=it.next();
			 System.out.println("key = "+entry.getKey() +"  Value = "+entry.getValue());
		 }
		 
		 
	}

}
