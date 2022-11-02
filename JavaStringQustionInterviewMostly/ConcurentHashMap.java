package com.str;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ConcurentHashMap extends Thread {
	
	
	
	static Map<Integer,String> map=new HashMap<>();
	
	//Insted of HashMap use ConcurrentHashMap 
	
//	static ConcurrentHashMap<Integer,String> map= new ConcurrentHashMap<Integer,String>();
	
	public static void main(String[] args) throws InterruptedException {
		map.put(1, "X");
		map.put(2, "Y");
		map.put(3, "Z");
		map.put(4, "S");
		
		ConcurentHashMap t1=new ConcurentHashMap();
//		ConcurentHashMap t2=new ConcurentHashMap();
		t1.start();
		
		for(Object entry:map.entrySet()) {
			
			Object s=entry;
			System.out.println(s);
			Thread.sleep(1000);
		}
		System.out.println(map);
	}
	
	

	public void run() {
		
		try {
			Thread.sleep(1000);
			
			map.put(5, "A");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
