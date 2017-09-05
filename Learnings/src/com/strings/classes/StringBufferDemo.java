package com.strings.classes;

public class StringBufferDemo {
	public static void main(String[] args)
	{
		
     String str="Hello";
     System.out.println(str);	
     
     
    StringBuffer demo1 = new StringBuffer("Hello") ;
    System.out.println(demo1);
    
    demo1.append(" helooooooo");
    
    System.out.println("String is after append: " + demo1);
    
    StringBuilder demo2= new StringBuilder("Hello");
    System.out.println(demo2);
    
    //Substring inplemented
    System.out.println(demo2.substring(2));
    
    //Substring with starting and end index
    System.out.println(demo2.substring(2,10));
    
    //Appended string
    demo2.append(" Addednewtext");
    System.out.println("String is after append: " + demo2);
    
    //String reverse
    System.out.println(demo2.reverse());
    
    //Implemented Stringbuffer capacity method
    int cap= demo2.capacity();
    System.out.println(cap);
    
    //int indx= new indexOf(demo2);
    
    //Characher At index
    System.out.println(demo2.charAt(2));    
  
  }

}
