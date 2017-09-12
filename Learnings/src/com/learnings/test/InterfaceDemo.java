package com.learnings.test;

interface InterfaceTestDemo {
	
	void show();
	 //void display();
	
	public default void defaultMethod()
	{
		System.out.println("This is default method");
	}
	
	public static void staticMethod()
	{
		System.out.println("This is static method of interface");
}
	
	 

}

class BDemo implements InterfaceTestDemo
{
	public void show()
	{
		System.out.println("This is show method");
	}
	
//	public void display()
//	{
//		System.out.println("This is show method");
//	}
//	
}

 public class InterfaceDemo
 {
	 public static void main(String args[])
	 {
		 InterfaceTestDemo objb= new BDemo();
		 objb.defaultMethod();
		 objb.show();
		 InterfaceTestDemo.staticMethod();
		 
	 }
 }