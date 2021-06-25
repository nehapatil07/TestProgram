package com.loops.object;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class arraylisteh {
	public static void main(String[] args) {
		HashSet<Integer> al=new HashSet<>();
		al.add(12);
		al.add(67);
		al.add(34);
		al.add(56);
		al.add(23);
		al.add(67);
		al.add(12);
		/*for(int i=0;i<al.size();i++){
			int y=al.get(i);
			System.out.println(y);
		}*/
	Iterator<Integer> it=al.iterator();
			while(it.hasNext()){
				int y=it.next();
				System.out.println(y);
			}
	/*for(int key:al.keySet()){
		String Value=al.get(key);
		System.out.println("Key= "+key+" value= "+Value);
	}*/
}
}
