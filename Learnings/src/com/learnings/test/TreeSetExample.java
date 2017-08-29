package com.learnings.test;

import java.util.*;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String args[]){  
	
		TreeSet<String> tset= new TreeSet<String>();
		
		tset.add("Sunil");
		tset.add("Kumar");
		tset.add("Testing");
		tset.add("Done");
		//tset.add(null);
		
		System.out.println(tset);
		
LinkedHashSet<String> lset= new LinkedHashSet<String>();
		
lset.add("Sunil");
lset.add("Kumar");
lset.add("Testing");
lset.add("Done");
lset.add(null);
		
		System.out.println(lset);
	}
}
