package com.learnings.test;

abstract class  shape{
	
	abstract void display();
	
	public void Show()
	{
		System.out.println("This is show method");
	}
	
}

class circle extends shape
{
	void display()
	{
		System.out.println("This is circle class");
	}
}

class triangle extends circle
{
	void display()
	{
		System.out.println("This is triangle class");
	}
}

public class AbstractClassDemo
 {
	
	public static void main(String args[])
	{
		circle abc= new triangle();
		abc.Show();
		abc.display();
		
	}
	
}
