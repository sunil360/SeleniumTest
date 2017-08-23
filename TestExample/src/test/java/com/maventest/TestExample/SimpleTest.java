package com.maventest.TestExample;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SimpleTest 
	{
		@BeforeClass
		public void simpleTest() {
			System.out.println("This is before class method.");
		}


	@Test(dataProvider="GetData")
	public void TestMethod (String param )
	{
        System.out.println("The parameter value is: " + param);
    }
	
	@DataProvider(name="GetData")
	public Object [][] DataMethod()
	{
		return new Object [][] {{"one"},{"two"}};
	}
	
}