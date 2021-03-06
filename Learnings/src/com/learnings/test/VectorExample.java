package com.learnings.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
	
	public static void main(String[] args)
	{
		Vector<String> vec= new Vector<String>();
		
		ArrayList<String> list= new ArrayList<String>(10);
		
		vec.add("Sunil");
		vec.add("Kumar");
		vec.add("Mukul");
		vec.add("Pratap");
		vec.add("Shikhar");
		vec.add("Shikhar");
		vec.addElement("Pankaj Pandey");
		vec.addElement("dasdasd");
		vec.addElement("fdfdf");
		vec.addElement("tttttt");
		vec.addElement("eeeeeey");
		vec.addElement("qqqqqqqy");
		vec.addElement("sssssssy");
		vec.addElement("gggggggggy");
		
		list.add("Sunil");
		list.add("Kumar");
		list.add("kumar");
		System.out.println(list.size());
		
		
		System.out.println(list);
		
		
		//vec.removeAll(list);
	
				
		
		System.out.println(vec);
		
		System.out.println("======================================================================");
		
		Iterator<String> itr=vec.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("======================================================================");
		
		for( String obj:vec)
		{
			System.out.println(obj);
		}
		
		System.out.println("Vector Size is: " +vec.size());
		System.out.println("Default capacity increment is: "+vec.capacity());
		
		if(vec.containsAll(list))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}
