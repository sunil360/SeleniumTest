package com.wrapperclass;

public class Test {

	   public static void main(String args[]) {
	      Integer x = 3; 
	      Integer y=5;   // boxes int to an Integer object
	      x =  x + 10;   // unboxes the Integer to a int
	      System.out.println(x.toString()); 
	      System.out.println(x.compareTo(3));
	      System.out.println(x.equals(y));  
	   }
	}