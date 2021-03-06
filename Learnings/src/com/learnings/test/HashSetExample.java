package com.learnings.test;

import java.util.*;

public class HashSetExample {

	public static void main(String args[]){  
		  //Creating HashSet and adding elements  
		  HashSet<String> set=new HashSet<String>(10);  
		  set.add("Ravi");  
		  set.add("Vijay");  
		  set.add("Ravi");  
		  set.add("Ajay");  
		 set.add(null);
		  /*set.add("bbbbbbb");
		  set.add("cccccccc");
		  set.add("dddddddddddddd");
		  set.add("eeeeeeeeeeee");
		  set.add("fffffffffffff");
		  set.add("ggggggggggggg");*/
		  
		  System.out.println(set);
		  
		  System.out.println("==============================================");
		  
		  for(String a: set)
		  {
			  System.out.println(a);
		  }
		  
		  System.out.println(set.clone());		  
		  
		  
		  System.out.println("==============================================");
		  //Traversing elements  
		  Iterator<String> itr=set.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		   		  }
		  
		  System.out.println(set.size());
	 }  
}  