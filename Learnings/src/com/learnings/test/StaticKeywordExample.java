package com.learnings.test;

public class StaticKeywordExample { 

int rollno;  
String name;  
static String college = "ITS";  
  
static void change(){  

college = "BBDIT";  
}  

StaticKeywordExample(int rollno, String name){  
this.rollno = rollno;  
this.name = name;  
}  

void display ()

{
	System.out.println(rollno+" "+name+" "+college);
}  

public static void main(String args[]){  
	StaticKeywordExample.change();  

	StaticKeywordExample s1 = new StaticKeywordExample (111,"Karan");  
	StaticKeywordExample s2 = new StaticKeywordExample (222,"Aryan");  
	StaticKeywordExample s3 = new StaticKeywordExample (333,"Sonoo");  

s1.display();  
s2.display();  
s3.display();  
}  
}  