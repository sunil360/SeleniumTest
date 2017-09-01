package com.learnings.test;

import java.util.*;

public class ArrayListExample {	
	
	public static void main(String [] args)
	{
		ArrayList<String> arrayList1= new ArrayList<String>();
		//arrayList1.add("Sunil");
		//arrayList1.add("Akhilesh");
		//arrayList1.add("Parmendra");
		arrayList1.add("Mohit");
		arrayList1.add("Abhinav");
		arrayList1.add("Rajneesh");
		System.out.println(arrayList1);
		
		System.out.println("==============================================");
		
		System.out.println(arrayList1.get(1));
		
		
		System.out.println("==============================================");
		
		ArrayList<String> arrayList2= new ArrayList<String>();
		arrayList2.add("Mohit");
		arrayList2.add("Abhinav");
		arrayList2.add("Rajneesh");
		
		
		
		
		for(String obj:arrayList2)
		{
			System.out.println(obj);
		}
		
		
		
		System.out.println("==============================================");
		
		
		if (arrayList1.equals(arrayList2))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
			
		
		for(String obj:arrayList2)
		{
			System.out.println(obj);
		}
		
		System.out.println("==============================================");
		System.out.println(arrayList1.size());
		System.out.println(arrayList1.hashCode());
		
		String[] s1 = arrayList1.toArray(new String[0]); 
		for(int i = 0; i< s1.length; ++i) {
	         //String contents = s1[i];
	         System.out.println(s1[i]);
		}
		
		System.out.println("==============================================");
		
				
	}

}