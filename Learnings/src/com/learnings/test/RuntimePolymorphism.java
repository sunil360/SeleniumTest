package com.learnings.test;

class A {
	
	public void aMethod()
	{
		System.out.println("This is First class method");
	}
	

}

 class B extends A
{
	public void aMethod()
	{
		//super.aMethod();
		//System.out.println("This is second class method");
	}
	
}


class C extends B
{
	
	public void aMethod()
	{
		//super.aMethod();
		//System.out.println("This is Third class method");
	}
	
}

public class RuntimePolymorphism
{
	 public static void main(String[] args)
	 {
		 A obj= new A();
		 obj.aMethod();
	 }
	 }
