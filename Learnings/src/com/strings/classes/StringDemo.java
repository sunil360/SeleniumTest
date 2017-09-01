package com.strings.classes;

public class StringDemo {
	public static void main(String[] args)
	{
		char [] helloarray= {'h','e','l','l','o', '.'};
		String hellostring= new String(helloarray);
		System.out.println(hellostring);
		int length=hellostring.length();
		System.out.println(length);
		
	    String palindrome = "dot saw I was tod";
	    String reverse = "";
	    System.out.println( palindrome );
	    int len = palindrome.length();
	    System.out.println( "String Length is : " + len );
	    System.out.println("This " + palindrome + " sihT");
	    
	    
	    for ( int i = len - 1; i >= 0; i-- )
	         reverse = reverse + palindrome.charAt(i);
	 
	      if (palindrome.equals(reverse))
	      {
	         System.out.println("Entered string is a palindrome.");
	         System.out.println(reverse);
	      }
	      else
	         System.out.println("Entered string is not a palindrome.");
	         
	}

}
