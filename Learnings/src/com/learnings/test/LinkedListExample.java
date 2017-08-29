package com.learnings.test;

import java.util.Iterator;
import java.util.LinkedList;

import org.testng.annotations.Test;

public class LinkedListExample {
	
	String str= "    sunil kumar     ";
	
	@Test
	public void linkedListExample()
	{
		LinkedList<Integer> llist= new LinkedList<Integer>();
		
		llist.add(0,4);
		llist.add(1,3);		
		llist.add(2,2);		
		llist.add(3,1);
		llist.add(4,2);
		
		System.out.println(llist);
		System.out.println(llist.indexOf(2));
		
				
		llist.add(2,5);
		System.out.println("After adding the values at specific index");
		System.out.println(llist);
		System.out.println(llist.indexOf(2));
		llist.add(45);
		
		
		
		llist.addFirst(10);
		llist.addLast(50);
		System.out.println("After adding the values for first and last element");
		System.out.println(llist);
		System.out.println(llist.size());
		System.out.println(llist.getFirst());
		System.out.println(llist.getLast());
		System.out.println(llist.indexOf(2));
		System.out.println(llist.lastIndexOf(2));
		
		
		
		//System.out.println(llist);
		
		/*Iterator itr=llist.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("==================================");
		
		for(Integer obj : llist)
		{
			System.out.println(obj);
		}*/
		
		
		
	}
	

}
