package com.strings.classes;

public class IgnoreCaseTest {


   public static void main(String[] args) {

      String str1 = "sachin tendulkar";
      String str2 = "amrood admin";
      String str3 = "AMROOD ADMIN";
      
      // checking for equality with case ignored
      boolean retval1 = str2.equalsIgnoreCase(str1);
      boolean retval2 = str2.equalsIgnoreCase(str3);
      boolean retval3 = str3.equalsIgnoreCase(str2);
  
      // prints the return value
      System.out.println("str2 is equal to str1 = " + retval1);
      System.out.println("str2 is equal to str3 = " + retval2);
      System.out.println(retval3);
   }
}